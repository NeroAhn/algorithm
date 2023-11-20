package com.example.codingtest.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Maximum_product_subarray_Test {

    @Test
    void maxProduct() {
        Maximum_product_subarray service = new Maximum_product_subarray();
        int[] nums = {-2,3,-4};
        int result = service.maxProduct(nums);
        Assertions.assertEquals(24, result);
    }
}