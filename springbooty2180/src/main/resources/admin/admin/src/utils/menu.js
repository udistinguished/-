const menu = {
    list() {
        return [{
            "backMenu": [{
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "用户",
                    "menuJump": "列表",
                    "tableName": "yonghu"
                }], "menu": "用户管理"
            }, {
                "child": [{
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "家庭账户",
                    "menuJump": "列表",
                    "tableName": "jiatingzhanghu"
                }], "menu": "家庭账户管理"
            }, {
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "收入分类",
                    "menuJump": "列表",
                    "tableName": "shourufenlei"
                }], "menu": "收入分类管理"
            }, {
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "支出分类",
                    "menuJump": "列表",
                    "tableName": "zhichufenlei"
                }], "menu": "支出分类管理"
            }, {
                "child": [{
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "收入管理",
                    "menuJump": "列表",
                    "tableName": "jiatingshouru"
                }], "menu": "收入管理"
            }, {
                "child": [{
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "支出管理",
                    "menuJump": "列表",
                    "tableName": "jiatingzhichu"
                }], "menu": "支出管理"
            }, {
                "child": [{
                    "buttons": ["查看", "修改", "删除"],
                    "menu": "银行储蓄",
                    "menuJump": "列表",
                    "tableName": "yinxingchuxu"
                }], "menu": "银行储蓄管理"
            }, {
                "child": [{"buttons": ["查看", "修改", "删除"], "menu": "债务信息", "menuJump": "列表", "tableName": "touzilicai"}],
                "menu": "债务信息管理"
            }, {
                "child": [{"buttons": ["新增", "查看", "修改", "删除"], "menu": "管理员", "tableName": "users"}],
                "menu": "管理员管理"
            }],
            "frontMenu": [],
            "hasBackLogin": "是",
            "hasBackRegister": "否",
            "hasFrontLogin": "否",
            "hasFrontRegister": "否",
            "roleName": "管理员",
            "tableName": "users"
        }, {
            "backMenu": [{
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除", "家庭收入", "家庭支出"],
                    "menu": "家庭账户",
                    "menuJump": "列表",
                    "tableName": "jiatingzhanghu"
                }], "menu": "家庭账户管理"
            }, {
                "child": [{
                    "buttons": ["新增","查看", "修改", "删除"],
                    "menu": "收入管理",
                    "menuJump": "列表",
                    "tableName": "jiatingshouru"
                }], "menu": "收入管理"
            }, {
                "child": [{
                    "buttons": ["新增","查看", "修改", "删除"],
                    "menu": "家庭支出",
                    "menuJump": "列表",
                    "tableName": "jiatingzhichu"
                }], "menu": "家庭支出管理"
            }, {
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "银行储蓄",
                    "menuJump": "列表",
                    "tableName": "yinxingchuxu"
                }], "menu": "银行储蓄管理"
            },{
                "child": [{
                    "buttons": ["新增", "查看", "修改", "删除"],
                    "menu": "债务信息管理",
                    "menuJump": "列表",
                    "tableName": "touzilicai"
                }], "menu": "债务信息管理"
            }],
            "frontMenu": [],
            "hasBackLogin": "是",
            "hasBackRegister": "是",
            "hasFrontLogin": "否",
            "hasFrontRegister": "否",
            "roleName": "用户",
            "tableName": "yonghu"
        }]
    }
}
export default menu;
