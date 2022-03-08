package com.example.restfulwebservice.file;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Input {

	private String downloadUrl;
	private String downloadPath;

}
