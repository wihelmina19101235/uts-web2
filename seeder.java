<?php

namespace Database\Seeder;

use App\Models\produk;
use Illuminate\Database\Seeder;

class produksTableseder extends Seeder
{

    /**
    *Run the Database Seeder.
    *
    *@return void
    */
    public fuction Run()
    {
        produk::create(
            [
                'nama' => "kingston 4GB", 'ID KATEGORI' => '3',
                'harga_beli' => '50000', 'HARGA_JUAL' => '100000'
            ],
            [
                'nama'=> "MOUSE LOGISTICK", 'ID KATEGORI' => '2',
                'harga_beli' => '15000', 'HARGA_JUAL' => '30000'
            ]
        );
    }
}