package beans.pk;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.hibernate.validator.Length;


/**
 * 部门岗位班别 主键
 * 
 * @author hs
 * 
 * @version 20180910 created
 *
 */
@Entity
@Table(name = "HR02")
@SuppressWarnings("serial")
public class HR02pk implements Serializable {
	
	private String dept;	//部门代号
	private String tid;		//班别代号
	
	
	public HR02pk(String dept, String tid) {
		super();
		this.dept = dept;
		this.tid = tid;
	}
	
	
	/**
	 * @return dept 部门代号
	 */
	@Column(name = "DEPT", length = 30)
	public String getDept() {
		return dept;
	}
	/**
	 * @param dept 部门代号
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	/**
	 * @return tid 班别代号
	 */
	@Column(name = "TID")
	@Length(max=1)
	public String getTid() {
		return tid;
	}
	/**
	 * @param tid 班别代号
	 */
	public void setTid(String tid) {
		this.tid = tid;
	}
	
	
	
	
	
	
	
	
	
	
	@Override
	public int hashCode() {
		int hashcode = new HashCodeBuilder().append(dept).append(tid).toHashCode();
		return hashcode;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof HR02pk)) {
			return false;			
		}
        HR02pk castObj = (HR02pk) obj;
        boolean equal = new EqualsBuilder().append(dept, castObj.dept)
        	.append(tid, castObj.tid).isEquals();
        return equal;
	}
	
	
	
}
