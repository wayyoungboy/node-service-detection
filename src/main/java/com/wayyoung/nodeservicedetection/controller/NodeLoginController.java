package com.wayyoung.nodeservicedetection.controller;

import com.wayyoung.nodeservicedetection.bean.NodeBean;
import com.wayyoung.nodeservicedetection.bean.ServiceResult;
import com.wayyoung.nodeservicedetection.beans.NodeLogInDTO;
import com.wayyoung.nodeservicedetection.service.NodeLogInService;
import com.wayyoung.nodeservicedetection.util.enums.ServiceCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nodeLogin")
@Slf4j
public class NodeLoginController extends BaseController {

    @Autowired
    private NodeLogInService nodeLogInService;

    //   @GetMapping("/Once")
//   public ServiceResult<NodeLogInDTO> getPromotionFromCache(@RequestParam long promId) {
//       try{
//        NodeBean nodeBean= nodeLogInService.LogIn(promId);
//
//      }catch (Exception e){
//           log.error("[op:findByPromotion] error, promId={}.", promId, e);
//           return failure(ServiceCode.DEFAULT_ERROR, e.getMessage());
//      }
//
//   }
    @GetMapping("/Oncetest")
    public String hello() {
        return "Hello Spring Boot!";
    }

    /**
     * 首次注册
     * @param address
     * @return
     **/
//    @GetMapping("/Once")
//    public ServiceResult<NodeLogInDTO> loginOnce(@RequestParam long address) {
//
//        //注册流程
////      if (){
////          nodeLogInService.LogIn(address);
////      }else {
////          failure(ServiceCode.DEFAULT_ERROR,"节点已被注册，请联系管理员");
////      }
//
//
//        //若未注册，返回唯一对应addressid用于后续服务；否则返回“设备已被注册请重新注册”
//
//    }

    /**
    *重新注册（带验证码标记）
     * @param address
     * @param rootid
     */
    @GetMapping("/Relogin")
    public ServiceResult<NodeLogInDTO> reOnce(@RequestParam long address,@RequestParam long rootid) {
        //

        //若已注册，返回唯一对应addressid用于后续服务；否则返回“设备已被注册请重新注册”
        return failure(ServiceCode.SUCCESS,"service test");
    }

}