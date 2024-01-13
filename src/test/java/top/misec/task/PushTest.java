package top.misec.task;

import org.junit.jupiter.api.Test;
import top.misec.push.impl.*;
import top.misec.push.model.PushMetaInfo;
import top.misec.push.model.PushResult;
import top.misec.utils.PushUtils;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * push test .
 *
 * @author itning
 * @since 2021/3/28 16:06
 */

public class PushTest {

    @Test
    public void testServerChanTurboPush() {

        PushMetaInfo pushMetaInfo = PushMetaInfo.builder()
                .chatId("")
                .token("")
                .secret("")
                .build();
        PushResult pushResult = new ServerChanTurboPush().doPush(pushMetaInfo, "testServerChanTurboPush");
        assertTrue(pushResult.isSuccess());
    }

    @Test
    public void testDingTalkPush() {

        PushMetaInfo pushMetaInfo = PushMetaInfo.builder()
                .chatId("")
                .token("")
                .secret("")
                .build();
        PushResult pushResult = new DingTalkPush().doPush(pushMetaInfo, "testDingTalkPush");
        assertTrue(pushResult.isSuccess());
    }

    @Test
    public void testDingTalkSecretPush() {

        PushMetaInfo pushMetaInfo = PushMetaInfo.builder()
                .chatId("")
                .token("")
                .secret("")
                .build();
        PushResult pushResult = new DingTalkSecretPush().doPush(pushMetaInfo, "testDingTalkSecretPush");
        assertTrue(pushResult.isSuccess());
    }

    @Test
    public void testPushPlusPush() {

        PushMetaInfo pushMetaInfo = PushMetaInfo.builder()
                .chatId("")
                .token("")
                .secret("")
                .build();
        PushResult pushResult = new PushPlusPush().doPush(pushMetaInfo, "testPushPlusPush");
        assertTrue(pushResult.isSuccess());
    }

    @Test
    public void testServerChanPush() {

        PushMetaInfo pushMetaInfo = PushMetaInfo.builder()
                .chatId("")
                .token("")
                .secret("")
                .build();
        PushResult pushResult = new ServerChanPush().doPush(pushMetaInfo, "testServerChanPush");
        assertTrue(pushResult.isSuccess());
    }

    @Test
    public void testTelegramCustomUrlPush() {

        PushMetaInfo pushMetaInfo = PushMetaInfo.builder()
                .chatId("")
                .token("")
                .secret("")
                .build();
        PushResult pushResult = new TelegramCustomUrlPush().doPush(pushMetaInfo, "testTelegramCustomUrlPush");
        assertTrue(pushResult.isSuccess());
    }

    @Test
    public void testTelegramPush() {

        PushMetaInfo pushMetaInfo = PushMetaInfo.builder()
                .chatId("")
                .token("")
                .secret("")
                .build();
        PushResult pushResult = new TelegramPush().doPush(pushMetaInfo, "testTelegramPush");
        assertTrue(pushResult.isSuccess());
    }

    @Test
    public void testWeComPush() {

        PushMetaInfo pushMetaInfo = PushMetaInfo.builder()
                .chatId("")
                .token("")
                .secret("")
                .build();
        PushResult pushResult = new WeComPush().doPush(pushMetaInfo, "testWeComPush");
        assertTrue(pushResult.isSuccess());
    }

    @Test
    void testWeComAppPush() {
        PushMetaInfo pushMetaInfo = PushMetaInfo.builder()
                .token("")
                .secret("")
                .agentId(0)
                .build();
        PushResult pushResult = new WeComAppPush().doPush(pushMetaInfo, "testWeComAppPush");
        assertTrue(pushResult.isSuccess());
    }

    @Test
    public void testContentSimplification() {
        String content = "-----版本信息-----\n" +
                "\n" +
                "当前版本: 2.1.2\n" +
                "\n" +
                "网络问题，未请求到新版本\n" +
                "\n" +
                "java.lang.NullPointerException: null\n" +
                "        at top.misec.utils.VersionInfo.printVersionInfo(VersionInfo.java:36)\n" +
                "        at top.misec.BiliMain.main(BiliMain.java:26)\n" +
                "使用自定义目录的配置文件\n" +
                "\n" +
                "读取自定义配置文件成功,若部分配置项不存在则会采用默认配置.\n" +
                "\n" +
                "------登录检查开始------\n" +
                "\n" +
                "Cookies可能失效了,请仔细检查配置中的Cookies是否有效\n" +
                "\n" +
                "任务[登录检查]运行失败\n" +
                "\n" +
                "java.lang.NullPointerException: null\n" +
                "        at top.misec.task.UserCheck.run(UserCheck.java:42)\n" +
                "        at top.misec.task.DailyTask.lambda$doDailyTask$0(DailyTask.java:69)\n" +
                "        at java.util.ArrayList.forEach(ArrayList.java:1259)\n" +
                "        at top.misec.task.DailyTask.doDailyTask(DailyTask.java:66)\n" +
                "        at top.misec.BiliMain.main(BiliMain.java:40)\n" +
                "------登录检查结束------\n" +
                "\n" +
                "\n" +
                "-----随机暂停22173ms-----\n" +
                "\n" +
                "\n" +
                "------硬币情况统计开始------\n" +
                "\n" +
                "------硬币情况统计结束------\n" +
                "\n" +
                "\n" +
                "-----随机暂停18564ms-----\n" +
                "\n" +
                "\n" +
                "------投币任务开始------\n" +
                "\n" +
                "任务[投币任务]运行失败\n" +
                "\n" +
                "java.lang.NullPointerException: null\n" +
                "        at top.misec.task.TaskInfoHolder.expConfirm(TaskInfoHolder.java:49)\n" +
                "        at top.misec.task.CoinAdd.run(CoinAdd.java:55)\n" +
                "        at top.misec.task.DailyTask.lambda$doDailyTask$0(DailyTask.java:69)\n" +
                "        at java.util.ArrayList.forEach(ArrayList.java:1259)\n" +
                "        at top.misec.task.DailyTask.doDailyTask(DailyTask.java:66)\n" +
                "        at top.misec.BiliMain.main(BiliMain.java:40)\n" +
                "------投币任务结束------\n" +
                "\n" +
                "\n" +
                "-----随机暂停27826ms-----\n" +
                "\n" +
                "\n" +
                "------赛事预测开始------\n" +
                "\n" +
                "任务[赛事预测]运行失败\n" +
                "\n" +
                "java.lang.NullPointerException: null\n" +
                "        at top.misec.api.OftenApi.getCoinBalance(OftenApi.java:23)\n" +
                "        at top.misec.task.MatchGame.run(MatchGame.java:35)\n" +
                "        at top.misec.task.DailyTask.lambda$doDailyTask$0(DailyTask.java:69)\n" +
                "        at java.util.ArrayList.forEach(ArrayList.java:1259)\n" +
                "        at top.misec.task.DailyTask.doDailyTask(DailyTask.java:66)\n" +
                "        at top.misec.BiliMain.main(BiliMain.java:40)\n" +
                "------赛事预测结束------\n" +
                "\n" +
                "\n" +
                "-----随机暂停16904ms-----\n" +
                "\n" +
                "\n" +
                "------每日漫画阅读开始------\n" +
                "\n" +
                "任务[每日漫画阅读]运行失败\n" +
                "\n" +
                "java.lang.NumberFormatException: For input string: \"unauthenticated\"\n" +
                "        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)\n" +
                "        at java.lang.Integer.parseInt(Integer.java:580)\n" +
                "        at java.lang.Integer.parseInt(Integer.java:615)\n" +
                "        at com.google.gson.JsonPrimitive.getAsInt(JsonPrimitive.java:228)\n" +
                "        at top.misec.task.MangaRead.run(MangaRead.java:32)\n" +
                "        at top.misec.task.DailyTask.lambda$doDailyTask$0(DailyTask.java:69)\n" +
                "        at java.util.ArrayList.forEach(ArrayList.java:1259)\n" +
                "        at top.misec.task.DailyTask.doDailyTask(DailyTask.java:66)\n" +
                "        at top.misec.BiliMain.main(BiliMain.java:40)\n" +
                "------每日漫画阅读结束------\n" +
                "\n" +
                "\n" +
                "-----随机暂停26046ms-----\n" +
                "\n" +
                "\n" +
                "------银瓜子换硬币开始------\n" +
                "\n" +
                "获取银瓜子状态失败\n" +
                "\n" +
                "------银瓜子换硬币结束------\n" +
                "\n" +
                "\n" +
                "-----随机暂停17374ms-----\n" +
                "\n" +
                "\n" +
                "------B站直播送出即将过期的礼物开始------\n" +
                "\n" +
                "\uD83D\uDC94赠送礼物异常 : \n" +
                "\n" +
                "java.lang.NullPointerException: null\n" +
                "        at top.misec.task.GiveGift.xliveGiftBagList(GiveGift.java:135)\n" +
                "        at top.misec.task.GiveGift.run(GiveGift.java:34)\n" +
                "        at top.misec.task.DailyTask.lambda$doDailyTask$0(DailyTask.java:69)\n" +
                "        at java.util.ArrayList.forEach(ArrayList.java:1259)\n" +
                "        at top.misec.task.DailyTask.doDailyTask(DailyTask.java:66)\n" +
                "        at top.misec.BiliMain.main(BiliMain.java:40)\n" +
                "------B站直播送出即将过期的礼物结束------\n" +
                "\n" +
                "\n" +
                "-----随机暂停14205ms-----\n" +
                "\n" +
                "\n" +
                "------观看分享视频开始------\n" +
                "\n" +
                "账号未登录\n" +
                "\n" +
                "任务[观看分享视频]运行失败\n" +
                "\n" +
                "java.lang.NullPointerException: null\n" +
                "        at top.misec.task.DailyTask.getDailyTaskStatus(DailyTask.java:59)\n" +
                "        at top.misec.task.VideoWatch.run(VideoWatch.java:29)\n" +
                "        at top.misec.task.DailyTask.lambda$doDailyTask$0(DailyTask.java:69)\n" +
                "        at java.util.ArrayList.forEach(ArrayList.java:1259)\n" +
                "        at top.misec.task.DailyTask.doDailyTask(DailyTask.java:66)\n" +
                "        at top.misec.BiliMain.main(BiliMain.java:40)\n" +
                "------观看分享视频结束------\n" +
                "\n" +
                "\n" +
                "-----随机暂停17494ms-----\n" +
                "\n" +
                "\n" +
                "------漫画签到开始------\n" +
                "\n" +
                "完成漫画签到\n" +
                "\n" +
                "------漫画签到结束------\n" +
                "\n" +
                "\n" +
                "-----随机暂停25690ms-----\n" +
                "\n" +
                "\n" +
                "------直播签到开始------\n" +
                "\n" +
                "直播签到失败: 账号未登录\n" +
                "\n" +
                "------直播签到结束------\n" +
                "\n" +
                "\n" +
                "-----随机暂停27721ms-----\n" +
                "\n" +
                "\n" +
                "------漫画权益领取开始------\n" +
                "\n" +
                "暂时无法查询会员状态，默认非大会员\n" +
                "\n" +
                "非大会员，跳过领取大会员权益\n" +
                "\n" +
                "------漫画权益领取结束------\n" +
                "\n" +
                "\n" +
                "-----随机暂停22419ms-----\n" +
                "\n" +
                "\n" +
                "------大会员月底B币券充电开始------\n" +
                "\n" +
                "查询充电对象的用户名失败，原因：{\"code\":-799,\"message\":\"请求过于频繁，请稍后再试\",\"ttl\":1}\n" +
                "\n" +
                "暂时无法查询会员状态，默认非大会员\n" +
                "\n" +
                "普通会员和月度大会员每月不赠送B币券，所以没法给自己充电哦\n" +
                "\n" +
                "------大会员月底B币券充电结束------\n" +
                "\n" +
                "\n" +
                "-----随机暂停25431ms-----\n" +
                "\n" +
                "\n" +
                "本日任务已全部执行完毕\n" +
                "\n" +
                "未请求到用户信息，暂无法计算等级相关数据\n" +
                "\n" +
                "推送内容长度[3856]大于最大长度[1000]进行分割处理\n" +
                "\n" +
                "分割数量：4\n" +
                "\n" +
                "推送结果：{\"errcode\":0,\"errmsg\":\"ok\",\"msgid\":\"WpLDpQFMGSE843kRbNhgXWnj6Oa-xJKnTsQfv3S8yu5JHAdUJHcw5ajCVhqz4C_M_pNJ94-IvnQyw2mQJ90nrA\"}\n" +
                "\n" +
                "推送结果：{\"errcode\":0,\"errmsg\":\"ok\",\"msgid\":\"WpLDpQFMGSE843kRbNhgXWnj6Oa-xJKnTsQfv3S8yu4LEk2ap7A07Q6u_PLvL30nMCKEx97NbG6benaPGQFSAw\"}\n" +
                "\n" +
                "推送结果：{\"errcode\":0,\"errmsg\":\"ok\",\"msgid\":\"WpLDpQFMGSE843kRbNhgXWnj6Oa-xJKnTsQfv3S8yu7gBgFRnEbnp_xDTOBqJsT7KllV-PDoIumPE7n4njuPEQ\"}\n" +
                "\n" +
                "推送结果：{\"errcode\":0,\"errmsg\":\"ok\",\"msgid\":\"WpLDpQFMGSE843kRbNhgXWnj6Oa-xJKnTsQfv3S8yu5Q5b9jnFVbdUdRmciSiVjeiMD4le5bthkAfO9zHQ6u7w\"}\n";
        System.out.println(PushUtils.simplifyContent(content));
    }
}
