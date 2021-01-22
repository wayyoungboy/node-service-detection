package com.wayyoung.nodeservicedetection.controller;

import com.wayyoung.nodeservicedetection.bean.ServiceResult;
import com.wayyoung.nodeservicedetection.beans.NodeLogInDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceLogin")
@Slf4j
public class ServiceLoginController extends BaseController {

    @PostMapping("/ServiceLogin")
    public ServiceResult<NodeLogInDTO> reOnce(@RequestParam long id) {
    return success(null);
    }
}
