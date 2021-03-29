package com.plete.util;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Header<T> {

    // api �넻�떊�떆媛�
//    @JsonProperty("transaction_time") //    �뜲�씠�꽣 �넻�떊�쓣 �븷 �븣�뒗 �뒪�꽕�씠�겕 耳��씠�뒪瑜� �븯�굹�뵫 吏��젙�븷 �븣 �궗�슜
    private String transactionTime;

    // api �쓳�떟 肄붾뱶
    private String resultCode;

    // api 遺�媛� �꽕紐�
    private String description;


    private T data;

    private Pagination pagination;

    // OK
    public static <T> Header<T> OK() {
        return (Header<T>) Header.builder()
                .transactionTime(LocalDateTime.now().toString())
                .resultCode("OK")
                .description("OK")
                .build();
    }

    // DATA OK
    public static <T> Header<T> OK(T data) {
        return (Header<T>) Header.builder()
                .transactionTime(LocalDateTime.now().toString())
                .resultCode("OK")
                .description("OK")
                .data(data)
                .build();
    }

    public static <T> Header<T> OK(T data, Pagination pagination) {
        return (Header<T>) Header.builder()
                .transactionTime(LocalDateTime.now().toString())
                .resultCode("OK")
                .description("OK")
                .data(data)
                .pagination(pagination)
                .build();
    }

    // ERROR
    public static <T> Header<T> ERROR(String description) {
        return (Header<T>) Header.builder()
                .transactionTime(LocalDateTime.now().toString())
                .resultCode("ERROR")
                .description(description)
                .build();
    }

}
