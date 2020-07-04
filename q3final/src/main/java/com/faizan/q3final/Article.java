package com.faizan.q3final;

import org.springframework.data.annotation.Id;

import static java.lang.String.format;

public class Article {

    @Id
    public String id;
    public String label;
    public String desc;
    public String vendor;

    public void setId(String id) {
        this.id = id;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getLabel() {
        return label;
    }

    public String getDesc() {
        return desc;
    }

    public String getVendor() {
        return vendor;
    }

    public String getId() {
        return id;
    }

    public Article() {}

    public Article(String id, String label, String desc,String vendor ) {
        this.label=label;
        this.desc=desc;
        this.vendor=vendor;
        this.id=id;
    }

    @Override
    public String toString() {
        return format(
                "Article[id=%s, Label='%s', Description='%s', Vendor = '%s']",
                id, label, desc, vendor);
    }
}
