package com.bp.digitalizacia_spravy_ciest.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.math.BigInteger

data class  ShowAllProblemsData(

    @SerializedName("position")
    @Expose
    var position: String,

    @SerializedName("id")
    @Expose
    var id: BigInteger,

    @SerializedName("kategoria")
    @Expose
    var kategoria: String,

    @SerializedName("popis")
    @Expose
    var popis: String,

    @SerializedName("stav_problemu")
    @Expose
    var stav_problemu: String,

    @SerializedName("stav_riesenia_problemu")
    @Expose
    var stav_riesenia_problemu: String,

    @SerializedName("popis_riesenia_problemu")
    @Expose
    var popis_riesenia_problemu: String,

    @SerializedName("created_at")
    @Expose
    var created_at: String,

    @SerializedName("pouzivatel")
    @Expose
    var pouzivatel: BigInteger,

    @SerializedName("priradeny_zamestnanec")
    @Expose
    var zamestnanec: String,

    @SerializedName("priorita")
    @Expose
    var priorita: String,

    @SerializedName("priradene_vozidlo")
    @Expose
    var vozidlo: String,

    @SerializedName("pouzivatel_meno")
    @Expose
    var pouzivatel_meno: String

    )