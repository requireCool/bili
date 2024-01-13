package top.misec.utils;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * version info.
 *
 * @author Junzhou Liu
 * @since 2020/11/21 15:22
 */
@Slf4j
@Data
public class VersionInfo {
    private static String releaseVersion = "";
    private static String releaseDate = "";
    private static String projectRepo = "https://github.com/OreosLab/bili";
    private static String releaseInfo = "";

    public static void initInfo() {
        String release = ReadFileUtils.loadJsonFromAsset("release.json");
        JsonObject jsonObject = new Gson().fromJson(release, JsonObject.class);
        releaseVersion = jsonObject.get("tag_main").getAsString();
        releaseDate = jsonObject.get("release_date").getAsString();
        releaseInfo = ReadFileUtils.loadJsonFromAsset("release.info");
    }

    public static void printVersionInfo() {
        initInfo();
        JsonObject jsonObject = HttpUtils.doGet("https://api.github.com/repos/OreosLab/bili/releases/latest");
        log.info("-----版本信息-----");
        log.info("当前版本: {}", releaseVersion);
        try {
            log.info("最新版本: {}", jsonObject.get("tag_name").getAsString().replaceAll("v", ""));
            log.info("更新内容: {}", jsonObject.get("body").getAsString().replaceAll("\"", "").trim());
            log.info("更新时间: {}", HelpUtil.utcTime(jsonObject.get("created_at").getAsString()));
        } catch (Exception e) {
            log.warn("网络问题，未请求到新版本");
        }
        log.info("-----版本信息-----");
    }
}