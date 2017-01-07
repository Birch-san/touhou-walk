package uk.co.birchlabs.touhouwalk.global;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import uk.co.birchlabs.touhouwalk.R;

/**
 * Created by birch on 06/01/2017.
 */

public class MikoDatabase {
    private static final Map<String, Miko> mikobase;

    static {
        mikobase = new TreeMap<>();
        addMiko(
                "alice",
                R.drawable.alice,
                "Alice Margatroid",
                "アリス・マーガトロイド"
        );
        addMiko(
                "aya",
                R.drawable.aya,
                "Aya Shameimaru",
                "射命丸 文"
        );
        addMiko(
                "benben",
                R.drawable.benben,
                "Benben Tsukumo",
                null
        );
        addMiko(
                "chen",
                R.drawable.chen,
                "Chen",
                null
        );
        addMiko(
                "chirno",
                R.drawable.chirno,
                "Cirno",
                "チルノ"
        );
        addMiko(
                "daiyousei",
                R.drawable.daiyousei,
                "Daiyousei",
                null
        );
        addMiko(
                "eirin",
                R.drawable.eirin,
                "Eirin Yagokoro",
                null
        );
        addMiko(
                "fran",
                R.drawable.fran,
                "Flandre Scarlet",
                "フランドール・スカーレット"
        );
        addMiko(
                "hatate",
                R.drawable.hatate,
                "Hatate Himekaidou",
                null
        );
        addMiko(
                "hijiri",
                R.drawable.hijiri,
                "Byakuren Hijiri",
                null
        );
        addMiko(
                "hina",
                R.drawable.hina,
                "Hina Kagiyama",
                null
        );
        addMiko(
                "huto",
                R.drawable.huto,
                "Huto",
                null
        );
        addMiko(
                "ichirin",
                R.drawable.ichirin,
                "Ichirin Kumoi",
                null
        );
        addMiko(
                "iku",
                R.drawable.iku,
                "Iku Nagae",
                "永江 衣玖"
        );
        addMiko(
                "kagerou",
                R.drawable.kagerou,
                "Kagerou Imaizumi",
                null
        );
        addMiko(
                "kaguya",
                R.drawable.kaguya,
                "Kaguya Houraisan",
                "蓬莱山 輝夜"
        );
        addMiko(
                "kanako",
                R.drawable.kanako,
                "Kanako Yasaka",
                null
        );
        addMiko(
                "keine",
                R.drawable.keine,
                "Keine Kamishirasawa",
                null
        );
        addMiko(
                "keinekimo",
                R.drawable.keinekimo,
                "Keinekimo",
                null
        );
        addMiko(
                "kisume",
                R.drawable.kisume,
                "Kisume",
                null
        );
        addMiko(
                "koa",
                R.drawable.koa,
                "Koakuma",
                null
        );
        addMiko(
                "kogasa",
                R.drawable.kogasa,
                "Kogasa Tatara",
                null
        );
        addMiko(
                "koishi",
                R.drawable.koishi,
                "Koishi Komeiji",
                null
        );
        addMiko(
                "kokoro",
                R.drawable.kokoro,
                "Hata no Kokoro",
                "秦 こころ"
        );
        addMiko(
                "komachi",
                R.drawable.komachi,
                "Komachi Onozuka",
                null
        );
        addMiko(
                "kyoko",
                R.drawable.kyoko,
                "Kyouko Kasodani",
                null
        );
        addMiko(
                "lily_black",
                R.drawable.lily_black,
                "Lily Black",
                null
        );
        addMiko(
                "lily_white",
                R.drawable.lily_white,
                "Lily White",
                null
        );
        addMiko(
                "mamizo",
                R.drawable.mamizo,
                "Mamizo Futatsuiwa",
                null
        );
        addMiko(
                "marisa",
                R.drawable.marisa,
                "Marisa Kirisame",
                "霧雨 魔理沙"
        );
        addMiko(
                "meirin",
                R.drawable.meirin,
                "Hong Meiling",
                null
        );
        addMiko(
                "melran",
                R.drawable.melran,
                "Melran",
                null
        );
        addMiko(
                "merancory",
                R.drawable.merancory,
                "Medicine Melancholy",
                null
        );
        addMiko(
                "miko",
                R.drawable.miko,
                "Toyosatomimi no Miko",
                null
        );
        addMiko(
                "minoriko",
                R.drawable.minoriko,
                "Minoriko Aki",
                null
        );
        addMiko(
                "mistia",
                R.drawable.mistia,
                "Mystia Lorelei",
                null
        );
        addMiko(
                "moko",
                R.drawable.moko,
                "Fujiwara no Mokou",
                null
        );
        addMiko(
                "momiji",
                R.drawable.momiji,
                "Momiji Inubashiri",
                null
        );
        addMiko(
                "murasa",
                R.drawable.murasa,
                "Minamitsu Murasa",
                null
        );
        addMiko(
                "nazu",
                R.drawable.nazu,
                "Nazrin",
                null
        );
        addMiko(
                "nitori",
                R.drawable.nitori,
                "Nitori Kawashiro",
                null
        );
        addMiko(
                "nue",
                R.drawable.nue,
                "Nue Houjuu",
                null
        );
        addMiko(
                "orin",
                R.drawable.orin,
                "Orange",
                null
        );
        addMiko(
                "pal",
                R.drawable.pal,
                "Parsee Mizuhashi",
                null
        );
        addMiko(
                "patyuri",
                R.drawable.patyuri,
                "Patchouli Knowledge",
                "パチュリー・ノーレッジ"
        );
        addMiko(
                "raiko",
                R.drawable.raiko,
                "Raiko Horikawa",
                null
        );
        addMiko(
                "ran",
                R.drawable.ran,
                "Ran Yakumo",
                null
        );
        addMiko(
                "reimu",
                R.drawable.reimu,
                "Reimu Hakurei",
                "博麗 霊夢"
        );
        addMiko(
                "remiria",
                R.drawable.remiria,
                "Remilia Scarlet",
                "レミリア・スカーレット"
        );
        addMiko(
                "rety",
                R.drawable.rety,
                "Letty Whiterock",
                null
        );
        addMiko(
                "riguru",
                R.drawable.riguru,
                "Wriggle Nightbug",
                null
        );
        addMiko(
                "rinnosuke",
                R.drawable.rinnosuke,
                "Rinnosuke Morichika",
                null
        );
        addMiko(
                "ririka",
                R.drawable.ririka,
                "Lyrica Prismriver",
                null
        );
        addMiko(
                "rumia",
                R.drawable.rumia,
                "Rumia",
                null
        );
        addMiko(
                "runasa",
                R.drawable.runasa,
                "Lunasa Prismriver",
                null
        );
        addMiko(
                "sakuya",
                R.drawable.sakuya,
                "Sakuya Izayoi",
                null
        );
        addMiko(
                "sanae",
                R.drawable.sanae,
                "Sanae Kochiya",
                "東風谷 早苗"
        );
        addMiko(
                "satori",
                R.drawable.satori,
                "Satori Komeiji",
                null
        );
        addMiko(
                "seiga",
                R.drawable.seiga,
                "Seiga Kaku",
                null
        );
        addMiko(
                "seija",
                R.drawable.seija,
                "Seija Kijin",
                null
        );
        addMiko(
                "sekibanki",
                R.drawable.sekibanki,
                "Sekibanki",
                null
        );
        addMiko(
                "shannhai",
                R.drawable.shannhai,
                "Shanghai",
                null
        );
        addMiko(
                "shinmyoumaru",
                R.drawable.shinmyoumaru,
                "Shinmyoumaru Sukuna",
                null
        );
        addMiko(
                "shizuha",
                R.drawable.shizuha,
                "Shizuha Aki",
                null
        );
        addMiko(
                "sikieiki",
                R.drawable.sikieiki,
                "Shikieiki Yamaxanadu",
                null
        );
        addMiko(
                "suika",
                R.drawable.suika,
                "Suika Ibuki",
                null
        );
        addMiko(
                "suwako",
                R.drawable.suwako,
                "Suwako Moriya",
                null
        );
        addMiko(
                "tei",
                R.drawable.tei,
                "Tewi Inaba",
                null
        );
        addMiko(
                "tenshi",
                R.drawable.tenshi,
                "Tenshi Hinanawi",
                null
        );
        addMiko(
                "tojiko",
                R.drawable.tojiko,
                "Soga no Tojiko",
                null
        );
        addMiko(
                "tojiko2",
                R.drawable.tojiko2,
                "Soga no Tojiko (2)",
                null
        );
        addMiko(
                "toramaru",
                R.drawable.toramaru,
                "Shou Toramaru",
                null
        );
        addMiko(
                "udonge",
                R.drawable.udonge,
                "Reisen Udongein Inaba",
                null
        );
        addMiko(
                "utsuho",
                R.drawable.utsuho,
                "Utsuho Reiuji",
                "霊烏路 空"
        );
        addMiko(
                "wakasagi",
                R.drawable.wakasagi,
                "Wakasagihime",
                null
        );
        addMiko(
                "yakumoyukari",
                R.drawable.yakumoyukari,
                "Yukari Yakumo",
                null
        );
        addMiko(
                "yamame",
                R.drawable.yamame,
                "Yamame Kurodani",
                null
        );
        addMiko(
                "yatsuhashi",
                R.drawable.yatsuhashi,
                "Yatsuhashi Tsukumo",
                null
        );
        addMiko(
                "yoshika",
                R.drawable.yoshika,
                "Yoshika Miyako",
                null
        );
        addMiko(
                "yoshika2",
                R.drawable.yoshika2,
                "Yoshika Miyako (2)",
                null
        );
        addMiko(
                "youmu",
                R.drawable.youmu,
                "Youmu Konpaku",
                "魂魄 妖夢"
        );
        addMiko(
                "yuugi",
                R.drawable.yuugi,
                "Yuugi Hoshiguma",
                null
        );
        addMiko(
                "yuuka",
                R.drawable.yuuka,
                "Yuuka Kazami",
                null
        );
        addMiko(
                "yuyuko",
                R.drawable.yuyuko,
                "Yuyuko Saigyouji",
                "西行寺 幽々子"
        );
    }

    private static void addMiko(
            String key,
            int resource,
            String engName,
            String jpName
    ) {
        mikobase.put(
                key,
                new Miko(
                        resource,
                        key,
                        engName,
                        jpName
                )
        );
    }

    public static Miko getMiko(String key) {
        return mikobase.get(key);
    }

    public static Set<String> getKeySet() {
        return mikobase.keySet();
    }

    public static String[] getKeys() {
        return mikobase.keySet().toArray(new String[mikobase.keySet().size()]);
    }

    private static final Set<String> defaultEnabledMikos;

    static {
        defaultEnabledMikos = new HashSet<>();
        defaultEnabledMikos.add("youmu");
        defaultEnabledMikos.add("marisa");
        defaultEnabledMikos.add("reimu");
        defaultEnabledMikos.add("aya");
        defaultEnabledMikos.add("alice");
        defaultEnabledMikos.add("sanae");
        defaultEnabledMikos.add("chirno");
    }

    public static boolean isMikoOnByDefault(String key) {
        return defaultEnabledMikos.contains(key);
    }
}
