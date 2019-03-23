package com.github.lmj.security.auth.controller;

import com.github.lmj.security.auth.biz.ClientBiz;
import com.github.lmj.security.auth.entity.Client;
import com.github.lmj.security.auth.entity.ClientService;
import com.github.lmj.security.common.msg.ObjectRestResponse;
import com.github.lmj.security.common.rest.BaseController;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("service")
public class ServiceController extends BaseController<ClientBiz,Client>{

    @RequestMapping(value = "/{id}/client", method = RequestMethod.PUT)
    @ResponseBody
    public ObjectRestResponse modifyUsers(@PathVariable int id, String clients){
        baseBiz.modifyClientServices(id, clients);
        return new ObjectRestResponse().rel(true);
    }

    @RequestMapping(value = "/{id}/client", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse<ClientService> getUsers(@PathVariable int id){
        return new ObjectRestResponse<ClientService>().rel(true).data(baseBiz.getClientServices(id));
    }
}
