package com.unitbv.accessGatewayManager.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class AccessLogFilterData {
    private String inTimestamp;
    private String outTimestamp;
}
