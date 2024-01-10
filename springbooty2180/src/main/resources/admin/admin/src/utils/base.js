const base = {
    get() {
        return {
            url : "http://localhost:8080/springbooty2180/",
            name: "springbooty2180",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbooty2180/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "家庭记账管理系统"
        } 
    }
}
export default base
