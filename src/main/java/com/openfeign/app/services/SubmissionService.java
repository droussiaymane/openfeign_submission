package com.openfeign.app.services;

import com.openfeign.app.constants.SubmissionPartnerConstants;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "feignSubmissionService",url="https://partners.apploi.com/")
public interface SubmissionService {

    @PostMapping(path = "/v1/application/easy-apply/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<?> submit(@RequestHeader HttpHeaders headers, @RequestBody Object object);

    private HttpHeaders getHeaders() {
        HttpHeaders headers = new HttpHeaders();

        headers.add("x-api-key", SubmissionPartnerConstants.XAPIKEY);
        headers.add("Accept", "application/json");
        headers.add("Content-Type", "application/json");
        return headers;
    }
}
