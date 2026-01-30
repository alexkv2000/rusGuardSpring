package com.rusguard.schema;

import java.util.List;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;

@Schema(description = "Запрос на установку уровней доступа сотруднику")
public class AccessLevelIdsRequest {
    @Schema(
            description = "Список идентификаторов уровней доступа (UUID)",
            example = "[\"7692f539-83d0-44e6-90f0-5015f00daaa5\", \"4e2fb631-c9ba-4c8e-9a51-2eb016d05203\"]",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED
    )
    @NotEmpty(message = "Список GUID не должен быть пустым")
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