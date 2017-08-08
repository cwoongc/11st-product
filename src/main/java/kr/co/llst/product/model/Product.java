package kr.co.llst.product.model;

import com.google.gson.annotations.SerializedName;


public class Product {

    @SerializedName("prd_no")
    private long prdNo;

    @SerializedName("prd_nm")
    private String prdNm;

    public long getPrdNo() {
        return prdNo;
    }

    public void setPrdNo(long prdNo) {
        this.prdNo = prdNo;
    }

    public String getPrdNm() {
        return prdNm;
    }

    public void setPrdNm(String prdNm) {
        this.prdNm = prdNm;
    }

    @Override
    public String toString() {
        return "Product{" +
            "prdNo=" + prdNo +
            ", prdNm='" + prdNm + '\'' +
            '}';
    }
}
