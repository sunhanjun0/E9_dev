//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package eyas.ecs;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import weaver.general.BaseBean;

public class ECSpsvm1 {

    public static void main(String[] args) {
        ECSinit ecSinit = new ECSinit("interface@aes.com", "XJTvcl");
        yxxxSyn(ecSinit);
    }

    private static void yxxxSyn(ECSinit ecSinit) {
        eee(ecSinit);

    }

    static void eee(ECSinit ecSinit) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        simpleDateFormat.format(date);
        int pageNum = 1;
        int pageSize = 10;
        boolean next = false;

        String jlid = "";
        String jlbh = "";
        String khmc = "";
        String khbh = "";
        String bmrq = "";
        String ecsppmc = "";
        String ecsyxxq = "";
        String gsxq = "";
        String khztwb = "";
        String lxwb = "";
        String gwfjwb = "";
        String ecskcgw = "";
        String ecsgwxq = "";
        String yjqd = "";
        String ejqd = "";
        String sjqdn = "";
        String sjqd = "";
        String df = "0";
        String bmzns = "0";
        String zjsmrq = "";
        String khyxxwb = "";
        String khflwb = "";
        String yxxqrrq = "";
        String scfjwb = "";
        String fpsj = "";
        String yysmrq = "";
        String yclrq = "";
        String pdtmkwb = "";
        String wlxts = "0";
        String cjsj = "";
        String gxsj = "";
        String khyl = "0";
        String smcs = "0";
        String tfrq = "";
        String tmkfpsjzyxq = "";
        String jzxm = "";
        String ecsjsyg = "";
        String kfxm = "";
        String ecstmk = "";
        String ecssczy = "";
        JSONObject reqObj = new JSONObject();
        JSONObject resObj = new JSONObject();

        try {
            reqObj.put("serviceName", "cqlQuery");
            reqObj.put("objectApiName", "khpp");
            reqObj.put("expressions", "LIMIT 10");
        } catch (JSONException var58) {
            var58.printStackTrace();
        }

        try {
            resObj = ecSinit.getData(reqObj);
            System.out.println(reqObj.toString());
            System.out.println(resObj.toString());
           // new BaseBean().writeLog("意向信息共" + resObj.getString("pageCount") + "页，第" + pageNum + "页执行结果" + resObj.getString("result") + "返回信息" + resObj.getString("returnInfo"));
           // System.out.println(resObj.getString("hasNext"));
           // next = resObj.getBoolean("hasNext");
        } catch (Exception var57) {
            //new BaseBean().writeLog("ECS同步异常！！" + resObj.toString());
            try {
                ecSinit.login();
            } catch (Exception var56) {
                var56.printStackTrace();
            }

            (new BaseBean()).writeLog(var57.getMessage());
        }

        JSONArray dataArr = new JSONArray();

        try {
            dataArr = resObj.getJSONArray("data");
        } catch (JSONException var55) {
            var55.printStackTrace();
        }

        for (int i = 0; i < dataArr.length(); ++i) {
            try {
                JSONObject data = dataArr.getJSONObject(i);
                System.out.println(data.toString());
                jlid = data.getString("id").equals("null") ? jlid : data.getString("id");
                System.out.println("记录ID ： " + jlid);
                jlbh = data.getString("name").equals("null") ? jlbh : data.getString("name");
                System.out.println("记录编号 ： " + jlbh);
                khmc = data.getString("khmc").equals("null") ? khmc : data.getString("khmc");
                System.out.println("客户名称 ： " + khmc);
                khbh = data.getString("khbh").equals("null") ? khbh : data.getString("khbh");
                System.out.println("客户编号 ： " + khbh);
                bmrq = data.getString("bmrq").equals("null") ? bmrq : data.getString("bmrq");
                System.out.println("报名日期 ： " + bmrq);
                ecsppmc = data.getString("ppmc").equals("null") ? ecsppmc : data.getString("ppmc");
                System.out.println("品牌名称 ： " + ecsppmc);
                ecsyxxq = data.getString("sjcs").equals("null") ? ecsyxxq : data.getString("sjcs");
                System.out.println("意向校区 ： " + ecsyxxq);
                gsxq = data.getString("gsxq").equals("null") ? gsxq : data.getString("gsxq");
                System.out.println("归属校区 ： " + gsxq);
                khztwb = data.getString("xyzt").equals("null") ? khztwb : data.getString("xyzt");
                System.out.println("客户状态文本 ： " + khztwb);
                lxwb = data.getString("khlx").equals("null") ? lxwb : data.getString("khlx");
                System.out.println("类型文本 ： " + lxwb);
                gwfjwb = data.getString("gwjb").equals("null") ? gwfjwb : data.getString("gwjb");
                System.out.println("顾问分级文本 ： " + gwfjwb);
                ecskcgw = data.getString("ownerid").equals("null") ? ecskcgw : data.getString("ownerid");
                System.out.println("课程顾问 ： " + ecskcgw);
                ecsgwxq = data.getString("ccxq").equals("null") ? ecsgwxq : data.getString("ccxq");
                System.out.println("归属校区 ： " + ecsgwxq);
                yjqd = data.getString("yjqd").equals("null") ? yjqd : data.getString("yjqd");
                System.out.println("一级渠道 ： " + yjqd);
                ejqd = data.getString("ejqd").equals("null") ? ejqd : data.getString("ejqd");
                System.out.println("二级渠道 ： " + ejqd);
                sjqdn = data.getString("sjqd").equals("null") ? sjqdn : data.getString("sjqd");
                System.out.println("三级渠道 ： " + sjqdn);
                sjqd = data.getString("fjqd").equals("null") ? sjqd : data.getString("fjqd");
                System.out.println("四级渠道 ： " + sjqd);
                df = data.getString("df").equals("null") ? df : data.getString("df");
                System.out.println("带访 ： " + df);
                bmzns = data.getString("bmzns").equals("null") ? bmzns : data.getString("bmzns");
                System.out.println("总报名年数 ： " + bmzns);
                zjsmrq = !data.getString("smsj").equals("null") && data.getString("smsj").length() >= 10 ? data.getString("smsj").substring(0, 10) : zjsmrq;
                System.out.println("最近上门时间 ： " + zjsmrq);
                khyxxwb = data.getString("khyxx").equals("null") ? khyxxwb : data.getString("khyxx");
                System.out.println("客户有效性文本 ： " + khyxxwb);
                khflwb = data.getString("khfl").equals("null") ? khflwb : data.getString("khfl");
                System.out.println("客户分类文本 ： " + khflwb);
                yxxqrrq = data.getString("pdrq").equals("null") ? yxxqrrq : data.getString("pdrq");
                System.out.println("有效性确认日期 ： " + yxxqrrq);
                scfjwb = data.getString("scfj").equals("null") ? scfjwb : data.getString("scfj");
                System.out.println("市场分级文本 ： " + scfjwb);
                fpsj = data.getString("fpsj").equals("null") ? fpsj : data.getString("fpsj");
                System.out.println("分配时间 ： " + fpsj);
                yysmrq = data.getString("yysmrq").equals("null") ? yysmrq : data.getString("yysmrq");
                System.out.println("意愿上门日期 ： " + yysmrq);
                yclrq = data.getString("yclrq").equals("null") ? yclrq : data.getString("yclrq");
                System.out.println("已处理日期 ： " + yclrq);
                pdtmkwb = data.getString("pdtmk").equals("null") ? pdtmkwb : data.getString("pdtmk");
                System.out.println("判断TMK ： " + pdtmkwb);
                wlxts = data.getString("wlxts").equals("null") ? wlxts : data.getString("wlxts");
                System.out.println("未联系天数 ： " + wlxts);
                cjsj = !data.getString("createdate").equals("null") && data.getString("createdate").length() >= 10 ? data.getString("createdate").substring(0, 10) : cjsj;
                System.out.println("创建时间 ： " + cjsj);
                gxsj = !data.getString("lastmodifydate").equals("null") && data.getString("lastmodifydate").length() >= 10 ? data.getString("lastmodifydate").substring(0, 10) : gxsj;
                System.out.println("最后更新时间 ： " + gxsj);
                khyl = data.getString("khyl").equals("null") ? khyl : data.getString("khyl");
                System.out.println("客户月龄 ： " + khyl);
                smcs = data.getString("smcs").equals("null") ? smcs : data.getString("smcs");
                System.out.println("上门次数 ： " + smcs);
                tfrq = data.getString("tfrq").equals("null") ? tfrq : data.getString("tfrq");
                System.out.println("退费日期 ： " + tfrq);
                tmkfpsjzyxq = data.getString("tmkfpsj").equals("null") ? tmkfpsjzyxq : data.getString("tmkfpsj");
                System.out.println("TMK分配时间专员-校区 ： " + tmkfpsjzyxq);
                jzxm = data.getString("jzxm").equals("null") ? jzxm : data.getString("jzxm").replace("'", "");
                System.out.println("TMK分配时间专员-校区 ： " + jzxm);
                ecsjsyg = data.getString("jsyg").equals("null") ? ecsjsyg : data.getString("jsyg");
                System.out.println("TMK分配时间专员-校区 ： " + ecsjsyg);
                kfxm = data.getString("sa").equals("null") ? kfxm : data.getString("sa");
                System.out.println("TMK分配时间专员-校区 ： " + kfxm);
                ecstmk = data.getString("tmk").equals("null") ? ecstmk : data.getString("tmk");
                System.out.println("TMK分配时间专员-校区 ： " + ecstmk);
                ecssczy = data.getString("sczy").equals("null") ? ecssczy : data.getString("sczy");
                System.out.println("TMK分配时间专员-校区 ： " + ecssczy);
            } catch (JSONException var59) {
                var59.printStackTrace();
            }

//                rs.execute("select id from uf_ecs_yxxx where jlid = '" + jlid + "'");
//                int count = 0;
//                if (rs.next()) {
//                    count = rs.getCounts();
//                }
//
//                if (count > 0) {
//                    rs.execute("update uf_ecs_yxxx set jlbh='" + jlbh + "',khmc='" + khmc + "',khbh='" + khbh + "',bmrq='" + bmrq + "',ecsppmc='" + ecsppmc + "',ecsyxxq='" + ecsyxxq + "',gsxq='" + gsxq + "',khztwb='" + khztwb + "',lxwb='" + lxwb + "',gwfjwb='" + gwfjwb + "',ecskcgw='" + ecskcgw + "',ecsgwxq='" + ecsgwxq + "',yjqd='" + yjqd + "',ejqd='" + ejqd + "',sjqdn='" + sjqdn + "',sjqd='" + sjqd + "',df='" + df + "',bmzns='" + bmzns + "',zjsmrq='" + zjsmrq + "',khyxxwb='" + khyxxwb + "',khflwb='" + khflwb + "',tfrq='" + tfrq + "',tmkfpsjzyxq='" + tmkfpsjzyxq + "',jzxm='" + jzxm + "',ecsjsyg='" + ecsjsyg + "',kfxm='" + kfxm + "',ecstmk='" + ecstmk + "',ecssczy='" + ecssczy + "' where jlid = '" + jlid + "'");
//                } else {
//                    rs.execute("INSERT INTO uf_ecs_yxxx (jlid,jlbh,khmc,khbh,bmrq,ecsppmc,ecsyxxq,gsxq,khztwb,lxwb,gwfjwb,ecskcgw,ecsgwxq,yjqd,ejqd,sjqdn,sjqd,df,bmzns,zjsmrq,khyxxwb,khflwb, yxxqrrq,scfjwb,fpsj,yysmrq,yclrq,pdtmkwb,wlxts,cjsj,gxsj,khyl,smcs,tfrq,tmkfpsjzyxq,jzxm,ecsjsyg,kfxm,ecstmk,ecssczy,formmodeid,modedatacreater,modedatacreatertype,modedatacreatetime,modedatacreatedate) VALUEs ('" + jlid + "','" + jlbh + "','" + khmc + "','" + khbh + "','" + bmrq + "','" + ecsppmc + "','" + ecsyxxq + "','" + gsxq + "','" + khztwb + "','" + lxwb + "','" + gwfjwb + "','" + ecskcgw + "','" + ecsgwxq + "','" + yjqd + "','" + ejqd + "','" + sjqdn + "','" + sjqd + "','" + df + "','" + bmzns + "','" + zjsmrq + "','" + khyxxwb + "','" + khflwb + "','" + yxxqrrq + "','" + scfjwb + "','" + fpsj + "','" + yysmrq + "','" + yclrq + "','" + pdtmkwb + "','" + wlxts + "','" + cjsj + "','" + gxsj + "','" + khyl + "','" + smcs + "','" + tfrq + "','" + tmkfpsjzyxq + "','" + jzxm + "','" + ecsjsyg + "','" + kfxm + "','" + ecstmk + "','" + ecssczy + "',32,1,0,CONVERT(varchar(100),getdate(), 24),CONVERT(varchar(100),getdate(), 23))");
//                    rs.execute("select max(id) as mid from uf_ecs_yxxx");
//                    int id = 0;
//                    if (rs.next()) {
//                        id = rs.getInt("mid");
//                    }
//
//                    (new ModeRightInfo()).editModeDataShare(1, 32, id);
//                    rs.execute("UPDATE a set a.khzt = b.selectvalue from uf_ecs_yxxx a LEFT JOIN workflow_SelectItem b on a.khztwb = b.selectname where b.fieldid=8085 and a.jlid='" + jlid + "'");
//                    rs.execute("UPDATE a set a.lx = b.selectvalue from uf_ecs_yxxx a LEFT JOIN workflow_SelectItem b on a.lxwb = b.selectname where b.fieldid=8070 and a.jlid='" + jlid + "'");
//                    rs.execute("UPDATE a set a.khyxx = b.selectvalue from uf_ecs_yxxx a LEFT JOIN workflow_SelectItem b on a.khyxxwb = b.selectname where b.fieldid=8073 and a.jlid='" + jlid + "'");
//                    rs.execute("UPDATE a set a.khfl = b.selectvalue from uf_ecs_yxxx a LEFT JOIN workflow_SelectItem b on a.khflwb = b.selectname where b.fieldid=8069 and a.jlid='" + jlid + "'");
//                    rs.execute("UPDATE a set a.scfj = b.selectvalue from uf_ecs_yxxx a LEFT JOIN workflow_SelectItem b on a.scfjwb = b.selectname where b.fieldid=8080 and a.jlid='" + jlid + "'");
//                    rs.execute("UPDATE a set a.pdtmk = b.selectvalue from uf_ecs_yxxx a LEFT JOIN workflow_SelectItem b on a.pdtmkwb = b.selectname where b.fieldid=8078 and a.jlid='" + jlid + "'");
//                    rs.execute("UPDATE a set a.oagsxq = b.id from uf_ecs_yxxx a LEFT JOIN uf_xqlb b on a.gsxq = b.ecsid where a.jlid='" + jlid + "'");
//                    rs.execute("UPDATE a set a.oayxxq = b.id from uf_ecs_yxxx a LEFT JOIN uf_xqlb b on a.ecsyxxq = b.ecsid where a.jlid='" + jlid + "'");
//                    rs.execute("UPDATE a set a.oagwxq = b.id from uf_ecs_yxxx a LEFT JOIN uf_xqlb b on a.ecsgwxq = b.ecsid where a.jlid='" + jlid + "'");
//                    rs.execute("UPDATE a set a.oakcgw = b.oayg from uf_ecs_yxxx a LEFT JOIN uf_ECSuser b on a.ecskcgw = b.yhid where a.jlid='" + jlid + "'");
//                    rs.execute("UPDATE a set a.oappmc = b.id from uf_ecs_yxxx a LEFT JOIN uf_pp b on a.ecsppmc = b.ecsppid where a.jlid='" + jlid + "'");
//                    rs.execute("UPDATE a set a.oaqy = b.qyll from uf_ecs_yxxx a LEFT JOIN uf_xqlb b on a.oayxxq = b.id where a.jlid='" + jlid + "'");
//                    rs.execute("UPDATE a set a.gxry = b.gxry from uf_ecs_yxxx a LEFT JOIN uf_ECSuser b on a.ecskcgw = b.yhid where a.jlid='" + jlid + "'");
//                    rs.execute("UPDATE a set a.oajsyg = b.oayg from uf_ecs_yxxx a LEFT JOIN uf_ECSuser b on a.ecsjsyg = b.yhid where a.jlid='" + jlid + "'");
//                    rs.execute("UPDATE a set a.oatmk = b.oayg from uf_ecs_yxxx a LEFT JOIN uf_ECSuser b on a.ecstmk = b.yhid where a.jlid='" + jlid + "'");
//                    rs.execute("UPDATE a set a.oasczy = b.oayg from uf_ecs_yxxx a LEFT JOIN uf_ECSuser b on a.ecssczy = b.yhid where a.jlid='" + jlid + "'");
//                }
        }
    }

}
