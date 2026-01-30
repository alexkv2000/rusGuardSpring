package com.rusguard.schema;

import java.util.List;

public class AccessLevelIdsRequest {
    private List<String> guid;

    // Конструкторы
//    public AccessLevelIdsRequest() {}
//
//    public AccessLevelIdsRequest(List<String> guid) {
//        this.guid = guid;
//    }

    // Геттеры и сеттеры
    public List<String> getGuid() {
        return guid;
    }

    public void setGuid(List<String> guid) {
        this.guid = guid;
    }
}