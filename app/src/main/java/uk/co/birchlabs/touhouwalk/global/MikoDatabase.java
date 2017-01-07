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
                new Miko(
                        R.drawable.alice,
                        "alice",
                        "Alice",
                        "射命丸 文"
                )
        );
        addMiko(
                "aya",
                new Miko(
                        R.drawable.aya,
                        "aya",
                        "Aya",
                        "射命丸 文"
                )
        );
        addMiko(
                "benben",
                new Miko(
                        R.drawable.benben,
                        "benben",
                        "Benben",
                        "射命丸 文"
                )
        );
        addMiko(
                "chen",
                new Miko(
                        R.drawable.chen,
                        "chen",
                        "Chen",
                        "射命丸 文"
                )
        );
        addMiko(
                "chirno",
                new Miko(
                        R.drawable.chirno,
                        "chirno",
                        "Chirno",
                        "射命丸 文"
                )
        );
        addMiko(
                "daiyousei",
                new Miko(
                        R.drawable.daiyousei,
                        "daiyousei",
                        "Daiyousei",
                        "射命丸 文"
                )
        );
        addMiko(
                "eirin",
                new Miko(
                        R.drawable.eirin,
                        "eirin",
                        "Eirin",
                        "射命丸 文"
                )
        );
        addMiko(
                "fran",
                new Miko(
                        R.drawable.fran,
                        "fran",
                        "Fran",
                        "射命丸 文"
                )
        );
        addMiko(
                "hatate",
                new Miko(
                        R.drawable.hatate,
                        "hatate",
                        "Hatate",
                        "射命丸 文"
                )
        );
        addMiko(
                "hijiri",
                new Miko(
                        R.drawable.hijiri,
                        "hijiri",
                        "Hijiri",
                        "射命丸 文"
                )
        );
        addMiko(
                "hina",
                new Miko(
                        R.drawable.hina,
                        "hina",
                        "Hina",
                        "射命丸 文"
                )
        );
        addMiko(
                "huto",
                new Miko(
                        R.drawable.huto,
                        "huto",
                        "Huto",
                        "射命丸 文"
                )
        );
        addMiko(
                "ichirin",
                new Miko(
                        R.drawable.ichirin,
                        "ichirin",
                        "Ichirin",
                        "射命丸 文"
                )
        );
        addMiko(
                "iku",
                new Miko(
                        R.drawable.iku,
                        "iku",
                        "Iku",
                        "射命丸 文"
                )
        );
        addMiko(
                "kagerou",
                new Miko(
                        R.drawable.kagerou,
                        "kagerou",
                        "Kagerou",
                        "射命丸 文"
                )
        );
        addMiko(
                "kaguya",
                new Miko(
                        R.drawable.kaguya,
                        "kaguya",
                        "Kaguya",
                        "射命丸 文"
                )
        );
        addMiko(
                "kanako",
                new Miko(
                        R.drawable.kanako,
                        "kanako",
                        "Kanako",
                        "射命丸 文"
                )
        );
        addMiko(
                "keine",
                new Miko(
                        R.drawable.keine,
                        "keine",
                        "Keine",
                        "射命丸 文"
                )
        );
        addMiko(
                "keinekimo",
                new Miko(
                        R.drawable.keinekimo,
                        "keinekimo",
                        "Keinekimo",
                        "射命丸 文"
                )
        );
        addMiko(
                "kisume",
                new Miko(
                        R.drawable.kisume,
                        "kisume",
                        "Kisume",
                        "射命丸 文"
                )
        );
        addMiko(
                "koa",
                new Miko(
                        R.drawable.koa,
                        "koa",
                        "Koa",
                        "射命丸 文"
                )
        );
        addMiko(
                "kogasa",
                new Miko(
                        R.drawable.kogasa,
                        "kogasa",
                        "Kogasa",
                        "射命丸 文"
                )
        );
        addMiko(
                "koishi",
                new Miko(
                        R.drawable.koishi,
                        "koishi",
                        "Koishi",
                        "射命丸 文"
                )
        );
        addMiko(
                "kokoro",
                new Miko(
                        R.drawable.kokoro,
                        "kokoro",
                        "Kokoro",
                        "射命丸 文"
                )
        );
        addMiko(
                "komachi",
                new Miko(
                        R.drawable.komachi,
                        "komachi",
                        "Komachi",
                        "射命丸 文"
                )
        );
        addMiko(
                "kyoko",
                new Miko(
                        R.drawable.kyoko,
                        "kyoko",
                        "Kyoko",
                        "射命丸 文"
                )
        );
        addMiko(
                "lily_black",
                new Miko(
                        R.drawable.lily_black,
                        "lily_black",
                        "Lily_black",
                        "射命丸 文"
                )
        );
        addMiko(
                "lily_white",
                new Miko(
                        R.drawable.lily_white,
                        "lily_white",
                        "Lily_white",
                        "射命丸 文"
                )
        );
        addMiko(
                "mamizo",
                new Miko(
                        R.drawable.mamizo,
                        "mamizo",
                        "Mamizo",
                        "射命丸 文"
                )
        );
        addMiko(
                "marisa",
                new Miko(
                        R.drawable.marisa,
                        "marisa",
                        "Marisa",
                        "射命丸 文"
                )
        );
        addMiko(
                "meirin",
                new Miko(
                        R.drawable.meirin,
                        "meirin",
                        "Meirin",
                        "射命丸 文"
                )
        );
        addMiko(
                "melran",
                new Miko(
                        R.drawable.melran,
                        "melran",
                        "Melran",
                        "射命丸 文"
                )
        );
        addMiko(
                "merancory",
                new Miko(
                        R.drawable.merancory,
                        "merancory",
                        "Merancory",
                        "射命丸 文"
                )
        );
        addMiko(
                "miko",
                new Miko(
                        R.drawable.miko,
                        "miko",
                        "Miko",
                        "射命丸 文"
                )
        );
        addMiko(
                "minoriko",
                new Miko(
                        R.drawable.minoriko,
                        "minoriko",
                        "Minoriko",
                        "射命丸 文"
                )
        );
        addMiko(
                "mistia",
                new Miko(
                        R.drawable.mistia,
                        "mistia",
                        "Mistia",
                        "射命丸 文"
                )
        );
        addMiko(
                "moko",
                new Miko(
                        R.drawable.moko,
                        "moko",
                        "Moko",
                        "射命丸 文"
                )
        );
        addMiko(
                "momiji",
                new Miko(
                        R.drawable.momiji,
                        "momiji",
                        "Momiji",
                        "射命丸 文"
                )
        );
        addMiko(
                "murasa",
                new Miko(
                        R.drawable.murasa,
                        "murasa",
                        "Murasa",
                        "射命丸 文"
                )
        );
        addMiko(
                "nazu",
                new Miko(
                        R.drawable.nazu,
                        "nazu",
                        "Nazu",
                        "射命丸 文"
                )
        );
        addMiko(
                "nitori",
                new Miko(
                        R.drawable.nitori,
                        "nitori",
                        "Nitori",
                        "射命丸 文"
                )
        );
        addMiko(
                "nue",
                new Miko(
                        R.drawable.nue,
                        "nue",
                        "Nue",
                        "射命丸 文"
                )
        );
        addMiko(
                "orin",
                new Miko(
                        R.drawable.orin,
                        "orin",
                        "Orin",
                        "射命丸 文"
                )
        );
        addMiko(
                "pal",
                new Miko(
                        R.drawable.pal,
                        "pal",
                        "Pal",
                        "射命丸 文"
                )
        );
        addMiko(
                "patyuri",
                new Miko(
                        R.drawable.patyuri,
                        "patyuri",
                        "Patyuri",
                        "射命丸 文"
                )
        );
        addMiko(
                "raiko",
                new Miko(
                        R.drawable.raiko,
                        "raiko",
                        "Raiko",
                        "射命丸 文"
                )
        );
        addMiko(
                "ran",
                new Miko(
                        R.drawable.ran,
                        "ran",
                        "Ran",
                        "射命丸 文"
                )
        );
        addMiko(
                "reimu",
                new Miko(
                        R.drawable.reimu,
                        "reimu",
                        "Reimu",
                        "射命丸 文"
                )
        );
        addMiko(
                "remiria",
                new Miko(
                        R.drawable.remiria,
                        "remiria",
                        "Remiria",
                        "射命丸 文"
                )
        );
        addMiko(
                "rety",
                new Miko(
                        R.drawable.rety,
                        "rety",
                        "Rety",
                        "射命丸 文"
                )
        );
        addMiko(
                "riguru",
                new Miko(
                        R.drawable.riguru,
                        "riguru",
                        "Riguru",
                        "射命丸 文"
                )
        );
        addMiko(
                "rinnosuke",
                new Miko(
                        R.drawable.rinnosuke,
                        "rinnosuke",
                        "Rinnosuke",
                        "射命丸 文"
                )
        );
        addMiko(
                "ririka",
                new Miko(
                        R.drawable.ririka,
                        "ririka",
                        "Ririka",
                        "射命丸 文"
                )
        );
        addMiko(
                "rumia",
                new Miko(
                        R.drawable.rumia,
                        "rumia",
                        "Rumia",
                        "射命丸 文"
                )
        );
        addMiko(
                "runasa",
                new Miko(
                        R.drawable.runasa,
                        "runasa",
                        "Runasa",
                        "射命丸 文"
                )
        );
        addMiko(
                "sakuya",
                new Miko(
                        R.drawable.sakuya,
                        "sakuya",
                        "Sakuya",
                        "射命丸 文"
                )
        );
        addMiko(
                "sanae",
                new Miko(
                        R.drawable.sanae,
                        "sanae",
                        "Sanae",
                        "射命丸 文"
                )
        );
        addMiko(
                "satori",
                new Miko(
                        R.drawable.satori,
                        "satori",
                        "Satori",
                        "射命丸 文"
                )
        );
        addMiko(
                "seiga",
                new Miko(
                        R.drawable.seiga,
                        "seiga",
                        "Seiga",
                        "射命丸 文"
                )
        );
        addMiko(
                "seija",
                new Miko(
                        R.drawable.seija,
                        "seija",
                        "Seija",
                        "射命丸 文"
                )
        );
        addMiko(
                "sekibanki",
                new Miko(
                        R.drawable.sekibanki,
                        "sekibanki",
                        "Sekibanki",
                        "射命丸 文"
                )
        );
        addMiko(
                "shannhai",
                new Miko(
                        R.drawable.shannhai,
                        "shannhai",
                        "Shannhai",
                        "射命丸 文"
                )
        );
        addMiko(
                "shinmyoumaru",
                new Miko(
                        R.drawable.shinmyoumaru,
                        "shinmyoumaru",
                        "Shinmyoumaru",
                        "射命丸 文"
                )
        );
        addMiko(
                "shizuha",
                new Miko(
                        R.drawable.shizuha,
                        "shizuha",
                        "Shizuha",
                        "射命丸 文"
                )
        );
        addMiko(
                "sikieiki",
                new Miko(
                        R.drawable.sikieiki,
                        "sikieiki",
                        "Sikieiki",
                        "射命丸 文"
                )
        );
        addMiko(
                "suika",
                new Miko(
                        R.drawable.suika,
                        "suika",
                        "Suika",
                        "射命丸 文"
                )
        );
        addMiko(
                "suwako",
                new Miko(
                        R.drawable.suwako,
                        "suwako",
                        "Suwako",
                        "射命丸 文"
                )
        );
        addMiko(
                "tei",
                new Miko(
                        R.drawable.tei,
                        "tei",
                        "Tei",
                        "射命丸 文"
                )
        );
        addMiko(
                "tenshi",
                new Miko(
                        R.drawable.tenshi,
                        "tenshi",
                        "Tenshi",
                        "射命丸 文"
                )
        );
        addMiko(
                "tojiko",
                new Miko(
                        R.drawable.tojiko,
                        "tojiko",
                        "Tojiko",
                        "射命丸 文"
                )
        );
        addMiko(
                "tojiko2",
                new Miko(
                        R.drawable.tojiko2,
                        "tojiko2",
                        "Tojiko2",
                        "射命丸 文"
                )
        );
        addMiko(
                "toramaru",
                new Miko(
                        R.drawable.toramaru,
                        "toramaru",
                        "Toramaru",
                        "射命丸 文"
                )
        );
        addMiko(
                "udonge",
                new Miko(
                        R.drawable.udonge,
                        "udonge",
                        "Udonge",
                        "射命丸 文"
                )
        );
        addMiko(
                "utsuho",
                new Miko(
                        R.drawable.utsuho,
                        "utsuho",
                        "Utsuho",
                        "射命丸 文"
                )
        );
        addMiko(
                "wakasagi",
                new Miko(
                        R.drawable.wakasagi,
                        "wakasagi",
                        "Wakasagi",
                        "射命丸 文"
                )
        );
        addMiko(
                "yakumoyukari",
                new Miko(
                        R.drawable.yakumoyukari,
                        "yakumoyukari",
                        "Yakumoyukari",
                        "射命丸 文"
                )
        );
        addMiko(
                "yamame",
                new Miko(
                        R.drawable.yamame,
                        "yamame",
                        "Yamame",
                        "射命丸 文"
                )
        );
        addMiko(
                "yatsuhashi",
                new Miko(
                        R.drawable.yatsuhashi,
                        "yatsuhashi",
                        "Yatsuhashi",
                        "射命丸 文"
                )
        );
        addMiko(
                "yoshika",
                new Miko(
                        R.drawable.yoshika,
                        "yoshika",
                        "Yoshika",
                        "射命丸 文"
                )
        );
        addMiko(
                "yoshika2",
                new Miko(
                        R.drawable.yoshika2,
                        "yoshika2",
                        "Yoshika2",
                        "射命丸 文"
                )
        );
        addMiko(
                "youmu",
                new Miko(
                        R.drawable.youmu,
                        "youmu",
                        "Youmu",
                        "射命丸 文"
                )
        );
        addMiko(
                "yuugi",
                new Miko(
                        R.drawable.yuugi,
                        "yuugi",
                        "Yuugi",
                        "射命丸 文"
                )
        );
        addMiko(
                "yuuka",
                new Miko(
                        R.drawable.yuuka,
                        "yuuka",
                        "Yuuka",
                        "射命丸 文"
                )
        );
        addMiko(
                "yuyuko",
                new Miko(
                        R.drawable.yuyuko,
                        "yuyuko",
                        "Yuyuko",
                        "射命丸 文"
                )
        );
    }

    private static void addMiko(String key, Miko miko) {
        mikobase.put(
                key,
                miko
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
        defaultEnabledMikos.add("udonge");
        defaultEnabledMikos.add("sanae");
        defaultEnabledMikos.add("chirno");
    }

    public static boolean isMikoOnByDefault(String key) {
        return defaultEnabledMikos.contains(key);
    }
}
