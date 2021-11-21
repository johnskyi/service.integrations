package com.gridnine.platform.service.integrations.model.kafka1c.entity;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class PurchaseOrder {

    private String number;
    private String text;
    private String otherText;
}
