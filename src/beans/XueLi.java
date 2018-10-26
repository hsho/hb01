package beans;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import org.hibernate.validator.Length;
import javax.persistence.Column;
/**
* ??
**/
@Entity
@Table(name = "HR_XUELI")
public class XueLi {
    private java.lang.String EDCA;	//??代?
    private java.lang.String NAME;	//??名?
    /**
     * 取得??代?
     * @return EDCA ??代?
     */
    @Id
    @Column(name = "EDCA")
    public java.lang.String getEDCA() {
        return EDCA;
    }
    /**
     * 設定??代?
     * @param EDCA ??代?
     */
    public void setEDCA(java.lang.String EDCA) {
        this.EDCA = EDCA;
    }
    /**
     * 取得??名?
     * @return NAME ??名?
     */
    @Length(max = 50)
    @Column(name = "NAME")
    public java.lang.String getNAME() {
        return NAME;
    }
    /**
     * 設定??名?
     * @param NAME ??名?
     */
    public void setNAME(java.lang.String NAME) {
        this.NAME = NAME;
    }
}
