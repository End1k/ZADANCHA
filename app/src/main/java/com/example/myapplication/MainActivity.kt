package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.io.Console
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun setup()
    {
        var ZHKHCKHZZZCHCH : THEK = THEK()
        while (true)
        {
            tick(ZHKHCKHZZZCHCH)
        }
    }

    fun tick(ZHKHCKHZZZCHCH: THEK)
    {
        for (i in ZHKHCKHZZZCHCH.homes)
        {
            if (!i.ut.isRepair)
            {
                i.ut.iznossa -= Random.nextInt(0,7)
            }
            else
            {
                i.ut.timeLeft -= 1
            }
        }
        IROON(ZHKHCKHZZZCHCH)
    }

    fun IROON (ZHKHCKHZZZCHCH: THEK) // I Ran Out Of Names
    {
        for (b in ZHKHCKHZZZCHCH.brigs)
        {
            b.timeLeft -= 1
        }
        repad(ZHKHCKHZZZCHCH)
    }

    fun repad (ZHKHCKHZZZCHCH: THEK)
    {
        for (i in ZHKHCKHZZZCHCH.homes)
        {
            if (i.ut.timeLeft < 1)
            {
                i.ut.iznossa += Random.nextInt(50,89)
                i.ut.isRepair = false
            }
        }

        for (b in ZHKHCKHZZZCHCH.brigs)
        {
            if (b.timeLeft < 1)
            {
                b.isWorking = false
            }
        }
        repa(ZHKHCKHZZZCHCH)
    }

    fun repa(ZHKHCKHZZZCHCH: THEK)
    {
        for (i in ZHKHCKHZZZCHCH.homes)
        {
            if (i.ut.iznossa <= 10)
            {
                for (b in ZHKHCKHZZZCHCH.brigs) // at some moment I stopped understand what's going on
                {
                    if (!b.isWorking && !i.ut.isRepair)
                    {
                        var randi : Int = Random.nextInt(3,5)
                        b.isWorking = true; b.timeLeft = randi
                        i.ut.isRepair = true; i.ut.timeLeft = randi
                    }
                }
            }
        }
        check(ZHKHCKHZZZCHCH)
    }

    fun check(ZHKHCKHZZZCHCH: THEK)
    {
        for (i in ZHKHCKHZZZCHCH.homes)
        {
            if (i.ut.iznossa <= -10)
            {
                // OUTPUT SOMETHIN LIKE GGGGGGGGGGGGGGGGGGG WP
                // while (true) {}
            }
        }
    }
}

class THEK()
{
    var homes : Array<HOME> = Array(20, {HOME()})
    var brigs : Array<BRIG> = Array(3, {BRIG()})
}

class HOME() //
{
    var ut : UTILITE = UTILITE()
}

class UTILITE()
{
    var iznossa : Int = Random.nextInt(12,99)
    var isRepair : Boolean = false
    var timeLeft : Int = 0
}

class BRIG()
{
    var isWorking : Boolean = false
    var timeLeft : Int = 0
}


//      //////              //                  //
//      //                  //                  //
//      //                  //                  //
//      //////  ////      ////    ////    ////  //  //
//      //      //  //  //  //  //  //  //  //  ////
//      //////  //  //  ////    ////    ////    //  //