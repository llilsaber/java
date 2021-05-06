package com.mega.mvc40;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class TextService {
public int text(String tel) {
	Random r = new Random();
	int num2 = r.nextInt(90000) + 10000;
	return num2;
}
}
