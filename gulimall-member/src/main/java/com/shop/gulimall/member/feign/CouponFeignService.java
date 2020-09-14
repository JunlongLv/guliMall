package com.shop.gulimall.member.feign;

import com.shop.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 声明式远程调用
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @GetMapping("/coupon/coupon/member/list")
    public R memberCoupons();

}
