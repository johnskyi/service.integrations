package com.gridnine.platform.service.integrations.model.kafka1c.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PurchaseOrderDTO {
    String number;
    String text;
    String anyText;
}
