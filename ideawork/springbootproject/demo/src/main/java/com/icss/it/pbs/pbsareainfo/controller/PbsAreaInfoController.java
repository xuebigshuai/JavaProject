package com.icss.it.pbs.pbsareainfo.controller;

import com.icss.it.pbs.pbsareainfo.model.PbsAreaInfo;
import com.icss.it.pbs.pbsareainfo.service.PbsAreaInfoService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/pbsAreaInfo")
public class PbsAreaInfoController {

    @Autowired
    private PbsAreaInfoService pbsAreaInfoService;

    @GetMapping("/selectByPrimaryKey/{uuid}")
    public PbsAreaInfo selectByPrimaryKey(@PathVariable String uuid) {
        return pbsAreaInfoService.selectByPrimaryKey(uuid);
    }

    @PostMapping("/selectByParam")
    public List<PbsAreaInfo> selectByParam(@RequestBody PbsAreaInfo pbsAreaInfo) {
        return pbsAreaInfoService.selectByParam(pbsAreaInfo);
    }

    @PostMapping("/updateByPrimaryKey")
    public void updateByPrimaryKey(@RequestBody PbsAreaInfo pbsAreaInfo) {
        pbsAreaInfoService.updateByPrimaryKey(pbsAreaInfo);
    }

    @GetMapping("/deleteByPrimaryKey/{uuid}")
    public void deleteByPrimaryKey(@PathVariable String uuid) {
        pbsAreaInfoService.deleteByPrimaryKey(uuid);
    }

    @PostMapping("/deleteByPrimaryKeys")
    public void deleteByPrimaryKeys(@RequestBody List<String> uuids) {
        pbsAreaInfoService.deleteByPrimaryKeys(uuids);
    }

    @PostMapping("/insert")
    public void insert(@RequestBody PbsAreaInfo pbsAreaInfo) {
        pbsAreaInfoService.insert(pbsAreaInfo);
    }

    @PostMapping("/insertBatch")
    public void insertBatch(@RequestBody List<PbsAreaInfo> pbsAreaInfos) {
        pbsAreaInfoService.insertBatch(pbsAreaInfos);
    }
}
