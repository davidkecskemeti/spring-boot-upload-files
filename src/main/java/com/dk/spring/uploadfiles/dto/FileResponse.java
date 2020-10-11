package com.dk.spring.uploadfiles.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class FileResponse {

    private String name;
    private String uri;
    private String type;
    private long size;
}
