<?php

use Illuminate\Support\Facades\Schema;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Database\Migration\Migration;

class AddUser IdFieldToPagesTable extends Migration
{
    /**   */

    *Run the Migration.
    *
    greturn void
public function up()
{
    if (Schema::hasTable('pages')) {
        Schema::hasTable('pages' , function (Blueprint $table)){
            $table->integer('user_id')->after('id');
        });
    }
}

/**
*Reverse the Migrations;
*
*@return void
*/
public function down()
{
    Schema::table('pages', function (Blueprint $table){
        ///
    });
}

