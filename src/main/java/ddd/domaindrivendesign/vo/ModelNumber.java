package ddd.domaindrivendesign.vo;

public class ModelNumber {

    private String productCode;
    private String branch;
    private String lot;

    public ModelNumber(String productCode, String branch, String lot) {
        if (productCode == null) throw new IllegalArgumentException("생산 코드를 적어주세요.");
        if (branch == null) throw new IllegalArgumentException("생산 기지를 적어주세요");
        if (lot == null) throw new IllegalArgumentException("상품 번호를 적어주세요");

        this.productCode = productCode;
        this.branch = branch;
        this.lot = lot;
    }

    @Override
    public String toString() {
        return "ModelNumber{" +
                "productCode='" + productCode + '\'' +
                ", branch='" + branch + '\'' +
                ", lot='" + lot + '\'' +
                '}';
    }
}
