package com.it.labor.whsitemlaborcost.controller;

import com.it.labor.whsitemlaborcost.model.WhsItemLaborCost;
import com.it.labor.whsitemlaborcost.service.WhsItemLaborCostService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/whsItemLaborCost")
public class WhsItemLaborCostController {

    @Autowired
    private WhsItemLaborCostService whsItemLaborCostService;

    @GetMapping("/selectByPrimaryKey/{uuid}")
    public WhsItemLaborCost selectByPrimaryKey(@PathVariable String uuid) {
        return whsItemLaborCostService.selectByPrimaryKey(uuid);
    }

    @PostMapping("/selectByParam")
    public List<WhsItemLaborCost> selectByParam(@RequestBody WhsItemLaborCost whsItemLaborCost) {
        return whsItemLaborCostService.selectByParam(whsItemLaborCost);
    }

    @PostMapping("/updateByPrimaryKey")
    public void updateByPrimaryKey(@RequestBody WhsItemLaborCost whsItemLaborCost) {
        whsItemLaborCostService.updateByPrimaryKey(whsItemLaborCost);
    }

    @GetMapping("/deleteByPrimaryKey/{uuid}")
    public void deleteByPrimaryKey(@PathVariable String uuid) {
        whsItemLaborCostService.deleteByPrimaryKey(uuid);
    }

    @PostMapping("/deleteByPrimaryKeys")
    public void deleteByPrimaryKeys(@RequestBody List<String> uuids) {
        whsItemLaborCostService.deleteByPrimaryKeys(uuids);
    }

    @PostMapping("/insert")
    public void insert(@RequestBody WhsItemLaborCost whsItemLaborCost) {
        whsItemLaborCostService.insert(whsItemLaborCost);
    }

    @PostMapping("/insertBatch")
    public void insertBatch(@RequestBody List<WhsItemLaborCost> whsItemLaborCosts) {
        whsItemLaborCostService.insertBatch(whsItemLaborCosts);
    }
}
