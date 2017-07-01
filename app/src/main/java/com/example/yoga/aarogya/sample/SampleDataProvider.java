package com.example.yoga.aarogya.sample;


import com.example.yoga.aarogya.model.DataItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SampleDataProvider {
    public static List<DataItem> dataItemList;
    public static Map<String, DataItem> dataItemMap;

    static {
        dataItemList = new ArrayList<>();
        dataItemMap = new HashMap<>();

        addItem(new DataItem(null, "abilify", "Salads",
                "abilify is used to treat irratability and symptoms of aggression,mood ,swings ,temper,and self injury related to autistic disorder in children who are atleast six years old.",
                1, "abilify-coupons.jpg"));

        addItem(new DataItem(null, "acyclovir", "Salads",
                "It is used to treat infections caused by herpes viruses such as genitalherpes , cold sores .chicken pox.",
                2, "acyclovir.jpg"));

        addItem(new DataItem(null, "amitriptyline", "Salads",
                "it is used to treat symptoms of depression and it is a tricyclic antidepressant.",
                3, "amitriptyline.jpg"));

        addItem(new DataItem(null, "atenolol", "Salads",
                "it is used to treat chest pain and hyper tension and also used to prevent heartattack.",
                4, "atenolol.jpg"));

        addItem(new DataItem(null, "Bactruim", "Starters",
                "used to treat ear infections urinary track infections bronchities,travellers diarrhea and pneumocystis, pneumonia.",
                1, "bactrim.jpg"));

        addItem(new DataItem(null, "bupropion", "Starters",
                "it is an anti depression medication used to treat major depressive disorder and seasonal effective disorder.",
                2, "bupropion.png"));

        addItem(new DataItem(null, "cetirizine", "Starters",
                "it is used to treat itching ,swelling caused by hives.",
                3, "cetirizine.jpg"));

        addItem(new DataItem(null, "concerta", "Starters",
                "it is used to treat attention deficit disorder,attention deficit hyperactivity disorder and narcolepsy",
                4, "concerta.jpg"));

        addItem(new DataItem(null, "diazepam", "Starters",
                "used to treat anxity disorders ,alcohol withdrawl symptoms or muscle spasms,and used with other mediactions to treat seizures.",
                5, "diazepam.jpeg"));

        addItem(new DataItem(null, "diclofenac", "Entrees",
                "used to treat mild to moderate pain,or signs and symptoms of osteoarthrithis also used to treat menstrual cramps",
                1, "diclofenac.jpg"));

        addItem(new DataItem(null, "effexor", "Entrees",
                "Used to treat major depressive disorder,anxiety and panic disorder",
                2, "effexor.jpg"));

        addItem(new DataItem(null, "flomax", "Entrees",
                "Used to improve urination in men with benign prostatic hyperplasia",
                3, "flomax.jpg"));

        addItem(new DataItem(null, "Gluctrol", "Entrees",
                "Used together with diet and exercise to treat type 2 diabetes",
                4, "glucotrol.jpg"));

        addItem(new DataItem(null, "herceptin", "Entrees",
                "used to treat certain type of breast cancer or stomach cancer. other cancer medicines are sometimes used in combination with herceptin.",
                5, "herceptin.jpg"));



    }

    private static void addItem(DataItem item) {
        dataItemList.add(item);
        dataItemMap.put(item.getItemId(), item);
    }

}

