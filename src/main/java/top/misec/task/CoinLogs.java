package top.misec.task;


import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;
import top.misec.api.ApiList;
import top.misec.utils.HttpUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * 硬币日志.
 *
 * @author junzhou
 */
@Slf4j
public class CoinLogs implements Task {
    @Override
    public void run() {

        JsonObject jsonObject = HttpUtils.doGet(ApiList.GET_COIN_LOG);

        if (jsonObject.get("code").getAsInt() == 0) {
            JsonObject data = jsonObject.getAsJsonObject("data");
            log.info("最近一周共计{}条硬币记录", data.get("count").getAsInt());
            JsonArray coinList = data.getAsJsonArray("list");

            double income = 0.0;
            double expend = 0.0;
            for (JsonElement jsonElement : coinList) {
                double delta = jsonElement.getAsJsonObject().get("delta").getAsDouble();
                //  String reason = jsonElement.getAsJsonObject().get("reason").getAsString();
                if (delta > 0) {
                    income += delta;
                } else {
                    expend += delta;
                }
            }
            log.info("最近一周收入{}个硬币", scaleCoinNum(income));
            log.info("最近一周支出{}个硬币", scaleCoinNum(expend));
        }
    }

    private static double scaleCoinNum(double coin) {
        return BigDecimal.valueOf(coin).setScale(1, RoundingMode. HALF_UP).doubleValue();
    }

    @Override
    public String getName() {
        return "硬币情况统计";
    }
}
