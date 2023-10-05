package com.it1311l.uap.simplespringbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SortInteger {
	@GetMapping("/sortInteger")
	public String sortInteger() {
		int[] numbers = {3, 10, 8, 9, 2, 2, 8, 10, 2, 3};
		
		int n = numbers.length;
        boolean swap;
        do {
            swap = false;
            for (int i = 1; i < n; i++) {
                if (numbers[i - 1] < numbers[i]) {
                    // Swap numbers[i-1] and numbers[i]
                    int temp = numbers[i - 1];
                    numbers[i - 1] = numbers[i];
                    numbers[i] = temp;
                    swap = true;
                }
            }
        } while (swap);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(numbers[i]);
            if (i < n - 1) {
                result.append(", ");
            }
        }
        return result.toString();
    }
}
