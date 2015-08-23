package com.example.stephen.traveland;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.stephen.traveland.Models.Country;
import com.example.stephen.traveland.Rest.Api;
import com.example.stephen.traveland.Rest.BossModel;
import com.example.stephen.traveland.Rest.VPModel;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class ListOfCountriesByLevel extends Activity {

    private List<Country> countries;
    private int id;

    BossModel bossModel1;
    VPModel vpModel1;


    //public static List<String> countryISO = new ArrayList<>();
    //private static List<String> cISO = new ArrayList<>();
    //private ArrayList<Country> myListItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_countries_by_level);

        Intent intent = getIntent();
        id = intent.getIntExtra("key", 0);
        gatherData(id);

    }


    public void combine(int id) {
        // instantiate list
        countries = new ArrayList<>();

        //add countries
        if (bossModel1.getData().getAE().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getAE());
        if (bossModel1.getData().getAD().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getAD());
        if (bossModel1.getData().getAF().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getAF());
        if (bossModel1.getData().getAG().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getAG());
        if (bossModel1.getData().getAI().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getAI());
        if (bossModel1.getData().getAL().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getAL());
        if (bossModel1.getData().getAM().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getAM());
        if (bossModel1.getData().getAO().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getAO());
        if (bossModel1.getData().getAQ().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getAQ());
        if (bossModel1.getData().getAR().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getAR());
        if (bossModel1.getData().getAS().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getAS());
        if (bossModel1.getData().getAT().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getAT());
        if (bossModel1.getData().getAU().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getAU());
        if (bossModel1.getData().getAW().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getAW());
        if (bossModel1.getData().getAZ().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getAZ());
        if (bossModel1.getData().getBA().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getBA());
        if (bossModel1.getData().getBB().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getBB());
        if (bossModel1.getData().getBD().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getBD());
        if (bossModel1.getData().getBE().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getBE());
        if (bossModel1.getData().getBF().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getBF());
        if (bossModel1.getData().getBG().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getBG());
        if (bossModel1.getData().getBH().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getBH());
        if (bossModel1.getData().getBI().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getBI());
        if (bossModel1.getData().getBJ().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getBJ());
        if (bossModel1.getData().getBL().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getBL());
        if (bossModel1.getData().getBM().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getBM());
        if (bossModel1.getData().getBN().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getBN());
        if (bossModel1.getData().getBO().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getBO());
        if (bossModel1.getData().getBQ().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getBQ());
        if (bossModel1.getData().getBR().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getBR());
        if (bossModel1.getData().getBS().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getBS());
        if (bossModel1.getData().getBT().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getBT());
        if (bossModel1.getData().getBW().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getBW());
        if (bossModel1.getData().getBY().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getBY());
        if (bossModel1.getData().getBZ().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getBZ());
        if (bossModel1.getData().getCD().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getCD());
        if (bossModel1.getData().getCD().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getCD());
        if (bossModel1.getData().getCF().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getCF());
        if (bossModel1.getData().getCG().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getCG());
        if (bossModel1.getData().getCH().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getCH());
        if (bossModel1.getData().getCI().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getCI());
        if (bossModel1.getData().getCK().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getCK());
        if (bossModel1.getData().getCL().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getCL());
        if (bossModel1.getData().getCM().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getCM());
        if (bossModel1.getData().getCN().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getCN());
        if (bossModel1.getData().getCO().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getCO());
        if (bossModel1.getData().getCR().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getCR());
        if (bossModel1.getData().getCU().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getCU());
        if (bossModel1.getData().getCV().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getCV());
        if (bossModel1.getData().getCW().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getCW());
        if (bossModel1.getData().getCY().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getCY());
        if (bossModel1.getData().getDE().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getDE());
        if (bossModel1.getData().getDJ().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getDJ());
        if (bossModel1.getData().getDK().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getDK());
        if (bossModel1.getData().getDM().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getDM());
        if (bossModel1.getData().getDO().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getDO());
        if (bossModel1.getData().getDZ().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getDZ());
        if (bossModel1.getData().getEC().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getEC());
        if (bossModel1.getData().getEE().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getEE());
        if (bossModel1.getData().getEG().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getEG());
        if (bossModel1.getData().getER().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getER());
        if (bossModel1.getData().getES().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getES());
        if (bossModel1.getData().getET().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getET());
        if (bossModel1.getData().getFI().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getFI());
        if (bossModel1.getData().getFJ().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getFJ());
        if (bossModel1.getData().getFK().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getFK());
        if (bossModel1.getData().getFM().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getFM());
        if (bossModel1.getData().getFR().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getFR());
        if (bossModel1.getData().getGA().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getGA());
        if (bossModel1.getData().getGB().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getGB());
        if (bossModel1.getData().getGD().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getGD());
        if (bossModel1.getData().getGE().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getGE());
        if (bossModel1.getData().getGF().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getGF());
        if (bossModel1.getData().getGH().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getGH());
        if (bossModel1.getData().getGI().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getGI());
        if (bossModel1.getData().getGL().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getGL());
        if (bossModel1.getData().getGM().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getGM());
        if (bossModel1.getData().getGN().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getGN());
        if (bossModel1.getData().getGP().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getGP());
        if (bossModel1.getData().getGQ().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getGQ());
        if (bossModel1.getData().getGR().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getGR());
        if (bossModel1.getData().getGT().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getGT());
        if (bossModel1.getData().getGU().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getGU());
        if (bossModel1.getData().getGW().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getGW());
        if (bossModel1.getData().getGY().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getGY());
        if (bossModel1.getData().getHK().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getHK());
        if (bossModel1.getData().getHN().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getHN());
        if (bossModel1.getData().getHR().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getHR());
        if (bossModel1.getData().getHT().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getHT());
        if (bossModel1.getData().getHU().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getHU());
        if (bossModel1.getData().getIC().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getIC());
        if (bossModel1.getData().getID().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getID());
        if (bossModel1.getData().getIE().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getIE());
        if (bossModel1.getData().getIL().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getIL());
        if (bossModel1.getData().getIN().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getIN());
        if (bossModel1.getData().getIQ().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getIQ());
        if (bossModel1.getData().getIR().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getIR());
        if (bossModel1.getData().getIS().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getIS());
        if (bossModel1.getData().getIT().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getIT());
        if (bossModel1.getData().getJM().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getJM());
        if (bossModel1.getData().getJO().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getJO());
        if (bossModel1.getData().getJP().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getJP());
        if (bossModel1.getData().getKE().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getKE());
        if (bossModel1.getData().getKG().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getKG());
        if (bossModel1.getData().getKH().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getKH());
        if (bossModel1.getData().getKI().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getKI());
        if (bossModel1.getData().getKM().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getKM());
        if (bossModel1.getData().getKN().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getKN());
        if (bossModel1.getData().getKP().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getKP());
        if (bossModel1.getData().getKR().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getKR());
        if (bossModel1.getData().getKW().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getKW());
        if (bossModel1.getData().getKY().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getKY());
        if (bossModel1.getData().getKZ().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getKZ());
        if (bossModel1.getData().getLA().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getLA());
        if (bossModel1.getData().getLB().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getLB());
        if (bossModel1.getData().getLC().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getLC());
        if (bossModel1.getData().getLI().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getLI());
        if (bossModel1.getData().getLK().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getLK());
        if (bossModel1.getData().getLR().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getLR());
        if (bossModel1.getData().getLS().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getLS());
        if (bossModel1.getData().getLT().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getLT());
        if (bossModel1.getData().getLU().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getLU());
        if (bossModel1.getData().getLV().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getLV());
        if (bossModel1.getData().getLY().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getLY());
        if (bossModel1.getData().getMA().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getMA());
        if (bossModel1.getData().getMC().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getMC());
        if (bossModel1.getData().getMD().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getMD());
        if (bossModel1.getData().getME().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getME());
        if (bossModel1.getData().getMF().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getMF());
        if (bossModel1.getData().getMG().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getMG());
        if (bossModel1.getData().getMH().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getMH());
        if (bossModel1.getData().getMK().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getMK());
        if (bossModel1.getData().getML().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getML());
        if (bossModel1.getData().getMM().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getMM());
        if (bossModel1.getData().getMN().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getMN());
        if (bossModel1.getData().getMO().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getMO());
        if (bossModel1.getData().getMP().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getMP());
        if (bossModel1.getData().getMQ().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getMQ());
        if (bossModel1.getData().getMR().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getMR());
        if (bossModel1.getData().getMS().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getMS());
        if (bossModel1.getData().getMT().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getMT());
        if (bossModel1.getData().getMU().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getMU());
        if (bossModel1.getData().getMV().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getMV());
        if (bossModel1.getData().getMW().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getMW());
        if (bossModel1.getData().getMX().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getMX());
        if (bossModel1.getData().getMY().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getMY());
        if (bossModel1.getData().getMZ().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getMZ());
        if (bossModel1.getData().getNA().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getNA());
        if (bossModel1.getData().getNC().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getNC());
        if (bossModel1.getData().getNE().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getNE());
        if (bossModel1.getData().getNG().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getNG());
        if (bossModel1.getData().getNI().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getNI());
        if (bossModel1.getData().getNL().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getNL());
        if (bossModel1.getData().getNO().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getNO());
        if (bossModel1.getData().getNP().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getNP());
        if (bossModel1.getData().getNR().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getNR());
        if (bossModel1.getData().getNU().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getNU());
        if (bossModel1.getData().getNZ().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getNZ());
        if (bossModel1.getData().getOM().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getOM());
        if (bossModel1.getData().getPA().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getPA());
        if (bossModel1.getData().getPE().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getPE());
        if (bossModel1.getData().getPF().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getPF());
        if (bossModel1.getData().getPG().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getPG());
        if (bossModel1.getData().getPH().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getPH());
        if (bossModel1.getData().getPK().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getPK());
        if (bossModel1.getData().getPL().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getPL());
        if (bossModel1.getData().getPM().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getPM());
        if (bossModel1.getData().getPR().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getPR());
        if (bossModel1.getData().getPT().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getPT());
        if (bossModel1.getData().getPW().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getPW());
        if (bossModel1.getData().getPY().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getPY());
        if (bossModel1.getData().getQA().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getQA());
        if (bossModel1.getData().getRO().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getRO());
        if (bossModel1.getData().getRS().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getRS());
        if (bossModel1.getData().getRU().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getRU());
        if (bossModel1.getData().getRW().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getRW());
        if (bossModel1.getData().getSA().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getSA());
        if (bossModel1.getData().getSB().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getSB());
        if (bossModel1.getData().getSC().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getSC());
        if (bossModel1.getData().getSD().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getSD());
        if (bossModel1.getData().getSE().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getSE());
        if (bossModel1.getData().getSG().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getSG());
        if (bossModel1.getData().getSI().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getSI());
        if (bossModel1.getData().getSK().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getSK());
        if (bossModel1.getData().getSL().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getSL());
        if (bossModel1.getData().getSM().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getSM());
        if (bossModel1.getData().getSN().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getSN());
        if (bossModel1.getData().getSO().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getSO());
        if (bossModel1.getData().getSR().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getSR());
        if (bossModel1.getData().getSS().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getSS());
        if (bossModel1.getData().getST().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getST());
        if (bossModel1.getData().getSV().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getSV());
        if (bossModel1.getData().getSX().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getSX());
        if (bossModel1.getData().getSY().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getSY());
        if (bossModel1.getData().getSZ().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getSZ());
        if (bossModel1.getData().getTC().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getTC());
        if (bossModel1.getData().getTD().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getTD());
        if (bossModel1.getData().getTG().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getTG());
        if (bossModel1.getData().getTH().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getTH());
        if (bossModel1.getData().getTJ().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getTJ());
        if (bossModel1.getData().getTK().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getTK());
        if (bossModel1.getData().getTL().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getTL());
        if (bossModel1.getData().getTM().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getTM());
        if (bossModel1.getData().getTN().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getTN());
        if (bossModel1.getData().getTO().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getTO());
        if (bossModel1.getData().getTR().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getTR());
        if (bossModel1.getData().getTT().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getTT());
        if (bossModel1.getData().getTV().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getTV());
        if (bossModel1.getData().getTW().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getTW());
        if (bossModel1.getData().getTZ().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getTZ());
        if (bossModel1.getData().getUA().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getUA());
        if (bossModel1.getData().getUG().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getUG());
        if (bossModel1.getData().getUS().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getUS());
        if (bossModel1.getData().getUY().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getUY());
        if (bossModel1.getData().getUZ().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getUZ());
        if (bossModel1.getData().getVC().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getVC());
        if (bossModel1.getData().getVE().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getVE());
        if (bossModel1.getData().getVG().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getVG());
        if (bossModel1.getData().getVI().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getVI());
        if (bossModel1.getData().getVN().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getVN());
        if (bossModel1.getData().getVU().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getVU());
        if (bossModel1.getData().getWS().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getWS());
        if (bossModel1.getData().getXK().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getXK());
        if (bossModel1.getData().getYE().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getYE());
        if (bossModel1.getData().getYT().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getYT());
        if (bossModel1.getData().getZA().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getZA());
        if (bossModel1.getData().getZM().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getZM());
        if (bossModel1.getData().getZW().getAdvisoryState() == id)
            countries.add(bossModel1.getData().getZW());

        populateListView();
    }

    public void gatherData(final int id) {

        final ProgressDialog progress = new ProgressDialog(this);
        progress.setTitle("Please wait...");
        progress.setMessage("Loading data...");
        progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progress.setIndeterminate(true);
        progress.show();

        bossModel1 = new BossModel();

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://data.international.gc.ca/travel-voyage")
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();

        Api service = restAdapter.create(Api.class);

        service.listRepos(new Callback<BossModel>() {
            @Override
            public void success(BossModel bossModel, Response response) {
                bossModel1 = bossModel;
                combine(id);
                progress.dismiss();
            }

            @Override
            public void failure(RetrofitError error) {
                Log.d("LISTREPO", "Error: " + error);
            }
        });
    }

    private void populateListView() {
        ArrayAdapter<Country> adapter = new MyListAdapter();
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Country clickedCountry = countries.get(position);
                String countryPrefix = clickedCountry.getCountryIso();

                gatherVPData(countryPrefix);
            }
        });
    }

    private class MyListAdapter extends ArrayAdapter<Country> {
        public MyListAdapter() {
            super(ListOfCountriesByLevel.this, R.layout.item_view, countries);
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            // Make sure we have a view to work with (may have been given null)
            View itemView = convertView;
            if (itemView == null) {
                itemView = getLayoutInflater().inflate(R.layout.item_view, parent, false);
            }

            final Country currentData = countries.get(position);

            TextView title = (TextView) itemView.findViewById(R.id.itemView_title);
            TextView date = (TextView) itemView.findViewById(R.id.itemView_date);
            TextView updateEng = (TextView) itemView.findViewById(R.id.itemView_updateEng);
            TextView updateFra = (TextView) itemView.findViewById(R.id.itemView_updateFra);

            title.setText(currentData.getEng().getName() + "/" + currentData.getFra().getName());
            date.setText(currentData.getDatePublished().getDate());
            updateEng.setText(currentData.getEng().getRecentUpdates());
            updateFra.setText(currentData.getFra().getRecentUpdates());

            return itemView;
        }
    }

    private void fillDialogDetails() {
        final Dialog alert = new Dialog(this);
        alert.setTitle("Details");
        alert.setContentView(R.layout.country_dialog_details);

        TextView title = (TextView) alert.findViewById(R.id.dialogTitle);
        TextView date = (TextView) alert.findViewById(R.id.dialogDate);
        TextView advisoryLevel = (TextView) alert.findViewById(R.id.dialogAdvisoryLevel);
        TextView advisory = (TextView) alert.findViewById(R.id.advisory);
        TextView travel = (TextView) alert.findViewById(R.id.dialogTraveling);
        TextView exitEntryWarnings = (TextView) alert.findViewById(R.id.dialogEntryExit);
        TextView health = (TextView) alert.findViewById(R.id.health);
        TextView lawCulture = (TextView) alert.findViewById(R.id.lawCulture);
        TextView disasters = (TextView) alert.findViewById(R.id.disasters);
        TextView officeHelpAbroad = (TextView) alert.findViewById(R.id.officeHelpAbroad);
        TextView closestOffice = (TextView) alert.findViewById(R.id.closestOffice);
        TextView logLat = (TextView) alert.findViewById(R.id.logLat);
        TextView phone = (TextView) alert.findViewById(R.id.phone);
        TextView phoneEmerg = (TextView) alert.findViewById(R.id.phoneEmerg);
        TextView phoneFax = (TextView) alert.findViewById(R.id.phoneFax);
        TextView email = (TextView) alert.findViewById(R.id.email);
        TextView moreInfo = (TextView) alert.findViewById(R.id.moreInfo);

        // http://stackoverflow.com/questions/240546/remove-html-tags-from-a-string
        title.setText(vpModel1.getData().getEng().getName() + "/" +
                vpModel1.getData().getFra().getName() + "  " + vpModel1.getData().getCountryIso());
        date.setText(vpModel1.getData().getEng().getFriendlyDate());
        advisoryLevel.setText(vpModel1.getData().getAdvisoryState().toString());
        advisory.setText(android.text.Html.fromHtml(vpModel1.getData().getEng().getAdvisories()) + "" +
                android.text.Html.fromHtml(vpModel1.getData().getFra().getAdvisories()));
        travel.setText(android.text.Html.fromHtml(vpModel1.getData().getEng().getSecurity()) + "\n" +
                android.text.Html.fromHtml(vpModel1.getData().getFra().getSecurity()));
        exitEntryWarnings.setText(android.text.Html.fromHtml(vpModel1.getData().getEng().getEntryExit()) + "\n" +
                android.text.Html.fromHtml(vpModel1.getData().getFra().getEntryExit()));
        health.setText(android.text.Html.fromHtml(vpModel1.getData().getEng().getHealth()) + "\n" +
                android.text.Html.fromHtml(vpModel1.getData().getFra().getHealth()));
        disasters.setText(android.text.Html.fromHtml(vpModel1.getData().getEng().getDisastersClimate()) + "\n" +
                android.text.Html.fromHtml(vpModel1.getData().getFra().getDisastersClimate()));
        lawCulture.setText(android.text.Html.fromHtml(vpModel1.getData().getEng().getLawsCulture()) + "\n" +
                android.text.Html.fromHtml(vpModel1.getData().getFra().getLawsCulture()));
        officeHelpAbroad.setText(vpModel1.getData().getEng().getOfficesHelpAbroad().getOpeningText() + " " + vpModel1.getData().getEng().getOfficesHelpAbroad().getClosingText() + "\n" +
                vpModel1.getData().getFra().getOfficesHelpAbroad().getOpeningText() + " " + vpModel1.getData().getFra().getOfficesHelpAbroad().getClosingText());
        closestOffice.setText(vpModel1.getData().getEng().getOffices().get(0).getCountry() + "," + vpModel1.getData().getEng().getOffices().get(0).getCity() + "/" +
                vpModel1.getData().getFra().getOffices().get(0).getCountry() + "," + vpModel1.getData().getFra().getOffices().get(0).getCity() + "\n" +
                vpModel1.getData().getEng().getOffices().get(0).getType() + "/" + vpModel1.getData().getFra().getOffices().get(0).getType());
        logLat.setText(vpModel1.getData().getEng().getOffices().get(0).getLng() + "," + vpModel1.getData().getEng().getOffices().get(0).getLat());
        phone.setText(vpModel1.getData().getEng().getOffices().get(0).getTelLegacy());
        phoneEmerg.setText(vpModel1.getData().getEng().getOffices().get(0).getEmergencyTollFreeLegacy());
        phoneFax.setText(vpModel1.getData().getEng().getOffices().get(0).getFaxLegacy());
        email.setText(vpModel1.getData().getEng().getOffices().get(0).getEmail1());
        moreInfo.setText(vpModel1.getData().getEng().getOffices().get(0).getInternet());

        alert.setCanceledOnTouchOutside(true);
        alert.show();
    }

    public void gatherVPData(final String countryIso) {

        final ProgressDialog progress = new ProgressDialog(this);
        progress.setTitle("Please wait...");
        progress.setMessage("Loading data...");
        progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progress.setIndeterminate(true);
        progress.show();

        vpModel1 = new VPModel();

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://data.international.gc.ca/travel-voyage")
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();

        Api service = restAdapter.create(Api.class);

        service.getCountry(countryIso, new Callback<VPModel>() {

            @Override
            public void success(VPModel vpModel, Response response) {
                vpModel1 = vpModel;

                progress.dismiss();

                if (vpModel1 != null) {
                    fillDialogDetails();
                }

            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
        //Log.d("SUCCESS2: ", "" + countries);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list_of_countries_by_level, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_help) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Help");
            builder.setMessage("By selecting the advisory level in the option menu and submiting your " +
                    "option with the submit button. A list will populate with results based on your choice.");
            builder.setNegativeButton("close", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            AlertDialog alert = builder.create();
            alert.show();
            return true;
        } else if (id == R.id.action_about) {
            AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
            builder2.setTitle("About");
            builder2.setMessage("This app offers advice and advisory information to keep you " +
                    "informed about the vacation destination you are planning to vacate.");
            builder2.setNegativeButton("close", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            AlertDialog alert = builder2.create();
            alert.show();
        }


        return super.onOptionsItemSelected(item);
    }
}
