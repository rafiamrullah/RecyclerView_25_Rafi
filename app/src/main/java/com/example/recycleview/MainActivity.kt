package com.example.recycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val haikyuuuList = listOf<Haikyuuu>(
            Haikyuuu(
                R.drawable.hinata_shoyo,
                nameHaikyuuu = "Hinata Shoyo",
                descHaikyuuu = "Hinata Shoyo adalah protagonis utama dari Haikyū!! seri oleh Haruichi Furudate. Hinata termotivasi untuk mulai bermain bola voli ketika menyaksikan seorang pemain bola voli SMA Karasuno berjuluk Raksasa Kecil mencetak poin melawan lawan yang jauh lebih besar darinya."
            ),
            Haikyuuu(
                R.drawable.daichi_sawamura,
                nameHaikyuuu = "Daichi Sawamura",
                descHaikyuuu = "Daichi Sawamura sebelumnya adalah siswa tahun ketiga di SMA Karasuno dan kapten dan pemain sayap di klub bola voli putra. Selama periode ketika Pelatih asli Ukai dirawat di rumah sakit, dia adalah salah satu kapten yang harus bertindak sebagai pelatih tim. Pada 2018, ia saat ini menjadi bagian dari Kepolisian Miyagi."
            ),
            Haikyuuu(
                R.drawable.kageyama_tobio,
                nameHaikyuuu = "Kageyama Tobio",
                descHaikyuuu = "Kageyama Tobio adalah deuteragonist dari Haikyū!! seri. Untuk sebagian besar seri, dia adalah tahun pertama di SMA Karasuno, bermain sebagai starter untuk klub bola voli putra."
            ),
            Haikyuuu(
                R.drawable.nishinoya,
                nameHaikyuuu = "Nishinoya Yu",
                descHaikyuuu = "Nishinoya Yu disebut sebagai Dewa Pelindung Karasuno. Di dalam animenya Nishinoya adalah Libero terhebat di prefektur walaupun dia kecil tapi talentanya sangat hebat. Nishinoya adalah sahabat dekat dari Asahi bahkan di animenya saat Asahi berhenti bermain Nishinoya juga berhenti dalam permainan bola voli."
            ),
            Haikyuuu(
                R.drawable.tsukishima,
                nameHaikyuuu = "Tsukishima Kei",
                descHaikyuuu = "Tsukishima Kei nomor punggung 11. Tsukishima adalah middle blok yang sangat handal. di musim ini ia banyak jadi sorotan karena berhasil memblok spike lawan dengan one touchnya. ia adalah tipe pemain yang sering berfifkir untuk melakukan teknik-teknik baru. ia juga banyak mengarahkan tim untuk melakukan hal-hal yang dapat menambah poin."
            ),
            Haikyuuu(
                R.drawable.ukai,
                nameHaikyuuu = "Ukai Keishin",
                descHaikyuuu = "Ukai Keishin adalah Pelatih Tim Voli SMA Karasuno dalam dalam serial anime Haikyuu!! karya Haruichi Furudate. Ia adalah cucu dari pelatih Ukai ikkei yang pernah membawa Karasuno menjuarai Kejuaraan Nasional, saat masa Raksasa Kecil. Keishin dulunya juga bersekolah di Karasuno dan pemain tim voli yang berposisi sebagai setter, sekrarang dia melatih Karasuno dan pemain generasi monsternya."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_char)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = HaikyuuuAdapter(this, haikyuuuList){
            val intent = Intent (this, DetailHaikyuuuActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}