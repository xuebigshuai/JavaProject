package com.it.po.pbspobaseinfo.controller;

import com.it.po.pbspobaseinfo.model.PbsPoBaseInfo;
import com.it.po.pbspobaseinfo.service.PbsPoBaseInfoService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/pbsPoBaseInfo")
public class PbsPoBaseInfoController {

    @Autowired
    private PbsPoBaseInfoService pbsPoBaseInfoService;

    @GetMapping("/selectByPrimaryKey/{uuid}")
    public PbsPoBaseInfo selectByPrimaryKey(@PathVariable String uuid) {
        return pbsPoBaseInfoService.selectByPrimaryKey(uuid);
    }

    @PostMapping("/selectByParam")
    public List<PbsPoBaseInfo> selectByParam(@RequestBody PbsPoBaseInfo pbsPoBaseInfo) {
        return pbsPoBaseInfoService.selectByParam(pbsPoBaseInfo);
    }

    @PostMapping("/updateByPrimaryKey")
    public void updateByPrimaryKey(@RequestBody PbsPoBaseInfo pbsPoBaseInfo) {
        pbsPoBaseInfoService.updateByPrimaryKey(pbsPoBaseInfo);
    }

    @GetMapping("/deleteByPrimaryKey/{uuid}")
    public void deleteByPrimaryKey(@PathVariable String uuid) {
        pbsPoBaseInfoService.deleteByPrimaryKey(uuid);
    }

    @PostMapping("/deleteByPrimaryKeys")
    public void deleteByPrimaryKeys(@RequestBody List<String> uuids) {
        pbsPoBaseInfoService.deleteByPrimaryKeys(uuids);
    }

    @PostMapping("/insert")
    public void insert(@RequestBody PbsPoBaseInfo pbsPoBaseInfo) {
        pbsPoBaseInfoService.insert(pbsPoBaseInfo);
    }

    @PostMapping("/insertBatch")
    public void insertBatch(@RequestBody List<PbsPoBaseInfo> pbsPoBaseInfos) {
        pbsPoBaseInfoService.insertBatch(pbsPoBaseInfos);
    }
}
