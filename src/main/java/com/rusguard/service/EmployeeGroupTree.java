package com.rusguard.service;

import com.rusguard.schema.EmployeeGroupTreeDto;
import org.datacontract.schemas._2004._07.vviinvestment_rusguard_dal_entities_entity_acs.AcsEmployeeGroup;
import java.util.*;

public class EmployeeGroupTree {

    public AcsEmployeeGroup group;
    public Map<String, AcsEmployeeGroup> groupsMap;
    public Set<String> visitedIds;

    public static <E> EmployeeGroupTreeDto buildGroupTree(AcsEmployeeGroup group,
                                                          Map<String, AcsEmployeeGroup> groupsMap,
                                                          Set<String> visitedIds) {

        if (group == null || group.getID() == null) {
//            System.out.println("Skipping null group or group with null ID");
            return null;
        }

//        System.out.println("Processing group: " + group.getID() + " - " +
//                (group.getName() != null ? group.getName().getValue() : "No name"));

        // Проверьте, нет ли циклических ссылок
        if (visitedIds.contains(group.getID())) {
//            System.out.println("Circular reference detected for group: " + group.getID());
            return null;
        }

        visitedIds.add(group.getID());

        EmployeeGroupTreeDto dto = new EmployeeGroupTreeDto();
        dto.setId(group.getID());
        dto.setName(group.getName() != null && group.getName().getValue() != null ?
                group.getName().getValue() : "закрыт"); //Без названия

        // Рекурсивное добавление дочерних элементов
        if (group.getEmployeeGroups() != null &&
                group.getEmployeeGroups().getValue() != null &&
                group.getEmployeeGroups().getValue().getAcsEmployeeGroup() != null) {

//            System.out.println("Processing children for group: " + group.getID() + " - " +
//                    group.getEmployeeGroups().getValue().getAcsEmployeeGroup().size() + " children");

            for (AcsEmployeeGroup childGroup : group.getEmployeeGroups().getValue().getAcsEmployeeGroup()) {
                if (childGroup != null && childGroup.getID() != null) {
//                    System.out.println("  Found child group: " + childGroup.getID() +
//                            (childGroup.getName() != null ? " - " + childGroup.getName().getValue() : ""));

                    // Попытка найти на карте полную дочернюю группу
                    AcsEmployeeGroup fullChildGroup = groupsMap.get(childGroup.getID());

                    // Если вы не нашли его на карте, используйте дочернюю группу напрямую (это может быть частичный объект).
                    if (fullChildGroup == null) {
//                        System.out.println("  Using partial child group (not found in groupsMap)");
                        fullChildGroup = childGroup;
                    }

                    // Процесс дочерней группы
                    Set<String> newVisited = new LinkedHashSet<>(visitedIds);
                    EmployeeGroupTreeDto childDto = buildGroupTree(fullChildGroup, groupsMap, newVisited);
                    if (childDto != null
                            && childDto.getName() != null && !childDto.getName().trim().toLowerCase().startsWith("закрыт")) { //Убрать "Закрыт'ые" группы
                        dto.addChild(childDto);
//                        System.out.println("  Successfully added child: " + childDto.getId() +
//                                " to group: " + group.getID());
                    }
                }
            }
        }

        visitedIds.remove(group.getID());
        return dto;
    }

    public AcsEmployeeGroup getGroup() {
        return group;
    }
    public void setGroup(AcsEmployeeGroup group) {
        this.group = group;
    }
    public Map<String, AcsEmployeeGroup> getGroupsMap() {
        return groupsMap;
    }
    public void setGroupsMap(Map<String, AcsEmployeeGroup> groupsMap) {
        this.groupsMap = groupsMap;
    }
    public Set<String> getVisitedIds() {
        return visitedIds;
    }
    public void setVisitedIds(Set<String> visitedIds) {
        this.visitedIds = visitedIds;
    }
}