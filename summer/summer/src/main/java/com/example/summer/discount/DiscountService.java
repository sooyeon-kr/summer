package com.example.summer.discount;

import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;

public interface DiscountService {
    DiscountRes discount(DiscountReq req);
}
