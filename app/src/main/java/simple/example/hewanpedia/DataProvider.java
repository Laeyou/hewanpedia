package simple.example.hewanpedia;


import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Anjing;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kucing;
import simple.example.hewanpedia.model.Kupu;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
        return anjings;
    }

    private static List<Kupu> intDataKupu(Context ctx) {
        List<Kupu> kupus = new ArrayList<>();
        kupus.add(new Kupu("Blue Morpho", "Amerika Selatan dan Meksiko",
                "Blue morpho memiliki sayap yang mengkilat,dengan ukuran kisaran 8 inci. Kupu-kupu ini dapat ditemukan di daerah amerika tengah, selatan dan meksiko", R.drawable.blue_morpho));
        kupus.add(new Kupu("Monarch Butterfly", "Amerika Utara",
                "Perpaduan warna hitam, putih dan coklat menjadikan monarc buterfly tidak terlalu mencolok dari segi warna. Namun tetap indah, karena memiliki corak yang unik dan tidak biasa.", R.drawable.monarch_buterfly));
        kupus.add(new Kupu("Australian Pointed Lady", "Australia dan New Zeeland",
                "Sesuai namanya, kupu-kupu ini berasal dari Australia. Jika kalian menganggap di Australia tidak ada kupu-kupu tentu kesalahan besar, terbukti dengan adanya jenis kupu-kupu ini.", R.drawable.australian_pointed_lady));
        kupus.add(new Kupu("Purple Spotted Swallowtail", "Papua Nugini",
                "Seperti namanya, purple spotted swallowtail memiliki arti bagian warna ungu dan sayap seperti ekor. Warnanya memang jelas sekali terlihat indah dengan warna ungu di bagian tengah sayap.",R.drawable.purple_spotted_swallowtail));
        kupus.add(new Kupu("Red Lacewing Buterfly" ,"Philiphina",
                "Kupu-kupu yang berasal dari daerah philifina ini memiliki bentuk seperti kupu-kubu besar di Indonesia, dengan warna sayap bagian tengah merah bata",R.drawable.red_lacewing_buterfly));
        kupus.add(new Kupu("Leopard Lacewing","China, Malaysia dan Singapura",
                "Jawaban paling mendekati kebenarannya ialah disebabkan corak kupu-kupu yang menyerupai seekor leopard.",R.drawable.leopard_lacewing));

        return kupus;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(intDataKupu(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
