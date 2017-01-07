package uk.co.birchlabs.touhouwalk.global;

import android.util.SparseArray;

import java.util.ArrayList;
import java.util.List;

import uk.co.birchlabs.touhouwalk.R;

/**
 * Created by birch on 06/01/2017.
 */

public class MikoDatabase {
    private static final List<Integer> resourceIDs;
    private static final SparseArray<Miko> mikobase;

    static {
        mikobase = new SparseArray<>();
        resourceIDs = new ArrayList<>();
        addMiko(
                R.drawable.alice,
                new Miko(
                        R.drawable.alice,
                        "alice",
                        "Alice",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.aya,
                new Miko(
                        R.drawable.aya,
                        "aya",
                        "Aya",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.benben,
                new Miko(
                        R.drawable.benben,
                        "benben",
                        "Benben",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.chen,
                new Miko(
                        R.drawable.chen,
                        "chen",
                        "Chen",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.chirno,
                new Miko(
                        R.drawable.chirno,
                        "chirno",
                        "Chirno",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.daiyousei,
                new Miko(
                        R.drawable.daiyousei,
                        "daiyousei",
                        "Daiyousei",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.eirin,
                new Miko(
                        R.drawable.eirin,
                        "eirin",
                        "Eirin",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.fran,
                new Miko(
                        R.drawable.fran,
                        "fran",
                        "Fran",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.hatate,
                new Miko(
                        R.drawable.hatate,
                        "hatate",
                        "Hatate",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.hijiri,
                new Miko(
                        R.drawable.hijiri,
                        "hijiri",
                        "Hijiri",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.hina,
                new Miko(
                        R.drawable.hina,
                        "hina",
                        "Hina",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.huto,
                new Miko(
                        R.drawable.huto,
                        "huto",
                        "Huto",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.ichirin,
                new Miko(
                        R.drawable.ichirin,
                        "ichirin",
                        "Ichirin",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.iku,
                new Miko(
                        R.drawable.iku,
                        "iku",
                        "Iku",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.kagerou,
                new Miko(
                        R.drawable.kagerou,
                        "kagerou",
                        "Kagerou",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.kaguya,
                new Miko(
                        R.drawable.kaguya,
                        "kaguya",
                        "Kaguya",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.kanako,
                new Miko(
                        R.drawable.kanako,
                        "kanako",
                        "Kanako",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.keine,
                new Miko(
                        R.drawable.keine,
                        "keine",
                        "Keine",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.keinekimo,
                new Miko(
                        R.drawable.keinekimo,
                        "keinekimo",
                        "Keinekimo",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.kisume,
                new Miko(
                        R.drawable.kisume,
                        "kisume",
                        "Kisume",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.koa,
                new Miko(
                        R.drawable.koa,
                        "koa",
                        "Koa",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.kogasa,
                new Miko(
                        R.drawable.kogasa,
                        "kogasa",
                        "Kogasa",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.koishi,
                new Miko(
                        R.drawable.koishi,
                        "koishi",
                        "Koishi",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.kokoro,
                new Miko(
                        R.drawable.kokoro,
                        "kokoro",
                        "Kokoro",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.komachi,
                new Miko(
                        R.drawable.komachi,
                        "komachi",
                        "Komachi",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.kyoko,
                new Miko(
                        R.drawable.kyoko,
                        "kyoko",
                        "Kyoko",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.lily_black,
                new Miko(
                        R.drawable.lily_black,
                        "lily_black",
                        "Lily_black",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.lily_white,
                new Miko(
                        R.drawable.lily_white,
                        "lily_white",
                        "Lily_white",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.mamizo,
                new Miko(
                        R.drawable.mamizo,
                        "mamizo",
                        "Mamizo",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.marisa,
                new Miko(
                        R.drawable.marisa,
                        "marisa",
                        "Marisa",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.meirin,
                new Miko(
                        R.drawable.meirin,
                        "meirin",
                        "Meirin",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.melran,
                new Miko(
                        R.drawable.melran,
                        "melran",
                        "Melran",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.merancory,
                new Miko(
                        R.drawable.merancory,
                        "merancory",
                        "Merancory",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.miko,
                new Miko(
                        R.drawable.miko,
                        "miko",
                        "Miko",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.minoriko,
                new Miko(
                        R.drawable.minoriko,
                        "minoriko",
                        "Minoriko",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.mistia,
                new Miko(
                        R.drawable.mistia,
                        "mistia",
                        "Mistia",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.moko,
                new Miko(
                        R.drawable.moko,
                        "moko",
                        "Moko",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.momiji,
                new Miko(
                        R.drawable.momiji,
                        "momiji",
                        "Momiji",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.murasa,
                new Miko(
                        R.drawable.murasa,
                        "murasa",
                        "Murasa",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.nazu,
                new Miko(
                        R.drawable.nazu,
                        "nazu",
                        "Nazu",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.nitori,
                new Miko(
                        R.drawable.nitori,
                        "nitori",
                        "Nitori",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.nue,
                new Miko(
                        R.drawable.nue,
                        "nue",
                        "Nue",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.orin,
                new Miko(
                        R.drawable.orin,
                        "orin",
                        "Orin",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.pal,
                new Miko(
                        R.drawable.pal,
                        "pal",
                        "Pal",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.patyuri,
                new Miko(
                        R.drawable.patyuri,
                        "patyuri",
                        "Patyuri",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.raiko,
                new Miko(
                        R.drawable.raiko,
                        "raiko",
                        "Raiko",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.ran,
                new Miko(
                        R.drawable.ran,
                        "ran",
                        "Ran",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.reimu,
                new Miko(
                        R.drawable.reimu,
                        "reimu",
                        "Reimu",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.remiria,
                new Miko(
                        R.drawable.remiria,
                        "remiria",
                        "Remiria",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.rety,
                new Miko(
                        R.drawable.rety,
                        "rety",
                        "Rety",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.riguru,
                new Miko(
                        R.drawable.riguru,
                        "riguru",
                        "Riguru",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.rinnosuke,
                new Miko(
                        R.drawable.rinnosuke,
                        "rinnosuke",
                        "Rinnosuke",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.ririka,
                new Miko(
                        R.drawable.ririka,
                        "ririka",
                        "Ririka",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.rumia,
                new Miko(
                        R.drawable.rumia,
                        "rumia",
                        "Rumia",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.runasa,
                new Miko(
                        R.drawable.runasa,
                        "runasa",
                        "Runasa",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.sakuya,
                new Miko(
                        R.drawable.sakuya,
                        "sakuya",
                        "Sakuya",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.sanae,
                new Miko(
                        R.drawable.sanae,
                        "sanae",
                        "Sanae",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.satori,
                new Miko(
                        R.drawable.satori,
                        "satori",
                        "Satori",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.seiga,
                new Miko(
                        R.drawable.seiga,
                        "seiga",
                        "Seiga",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.seija,
                new Miko(
                        R.drawable.seija,
                        "seija",
                        "Seija",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.sekibanki,
                new Miko(
                        R.drawable.sekibanki,
                        "sekibanki",
                        "Sekibanki",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.shannhai,
                new Miko(
                        R.drawable.shannhai,
                        "shannhai",
                        "Shannhai",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.shinmyoumaru,
                new Miko(
                        R.drawable.shinmyoumaru,
                        "shinmyoumaru",
                        "Shinmyoumaru",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.shizuha,
                new Miko(
                        R.drawable.shizuha,
                        "shizuha",
                        "Shizuha",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.sikieiki,
                new Miko(
                        R.drawable.sikieiki,
                        "sikieiki",
                        "Sikieiki",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.suika,
                new Miko(
                        R.drawable.suika,
                        "suika",
                        "Suika",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.suwako,
                new Miko(
                        R.drawable.suwako,
                        "suwako",
                        "Suwako",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.tei,
                new Miko(
                        R.drawable.tei,
                        "tei",
                        "Tei",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.tenshi,
                new Miko(
                        R.drawable.tenshi,
                        "tenshi",
                        "Tenshi",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.tojiko,
                new Miko(
                        R.drawable.tojiko,
                        "tojiko",
                        "Tojiko",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.tojiko2,
                new Miko(
                        R.drawable.tojiko2,
                        "tojiko2",
                        "Tojiko2",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.toramaru,
                new Miko(
                        R.drawable.toramaru,
                        "toramaru",
                        "Toramaru",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.udonge,
                new Miko(
                        R.drawable.udonge,
                        "udonge",
                        "Udonge",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.utsuho,
                new Miko(
                        R.drawable.utsuho,
                        "utsuho",
                        "Utsuho",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.wakasagi,
                new Miko(
                        R.drawable.wakasagi,
                        "wakasagi",
                        "Wakasagi",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.yakumoyukari,
                new Miko(
                        R.drawable.yakumoyukari,
                        "yakumoyukari",
                        "Yakumoyukari",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.yamame,
                new Miko(
                        R.drawable.yamame,
                        "yamame",
                        "Yamame",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.yatsuhashi,
                new Miko(
                        R.drawable.yatsuhashi,
                        "yatsuhashi",
                        "Yatsuhashi",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.yoshika,
                new Miko(
                        R.drawable.yoshika,
                        "yoshika",
                        "Yoshika",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.yoshika2,
                new Miko(
                        R.drawable.yoshika2,
                        "yoshika2",
                        "Yoshika2",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.youmu,
                new Miko(
                        R.drawable.youmu,
                        "youmu",
                        "Youmu",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.yuugi,
                new Miko(
                        R.drawable.yuugi,
                        "yuugi",
                        "Yuugi",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.yuuka,
                new Miko(
                        R.drawable.yuuka,
                        "yuuka",
                        "Yuuka",
                        "射命丸 文"
                )
        );
        addMiko(
                R.drawable.yuyuko,
                new Miko(
                        R.drawable.yuyuko,
                        "yuyuko",
                        "Yuyuko",
                        "射命丸 文"
                )
        );
    }

    private static void addMiko(int resourceId, Miko miko) {
        mikobase.put(
                resourceId,
                miko
        );
        resourceIDs.add(resourceId);
    }

    public static Miko getMiko(int resourceId) {
        return mikobase.get(resourceId);
    }

    public static Integer[] getResourceIDs() {
        return resourceIDs.toArray(new Integer[resourceIDs.size()]);
    }
}
