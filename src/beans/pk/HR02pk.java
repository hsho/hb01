package beans.pk;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;


/**
 * 部门岗位班别的主键
 * 
 * @author hs
 * 
 * @version 20180910 created
 *
 */
@Entity
@Table(name = "HR02")
public class HR02pk implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5689996485399116989L;
	
	private String dept;
	private String tid;
	
	
	public HR02pk(String dept, String tid) {
		super();
		this.dept = dept;
		this.tid = tid;
	}
	
	
	/**
	 * 部门代号
	 * 
	 * @return the dept
	 */
	@Column(name = "DEPT")
	public String getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	/**
	 * 班别代号
	 * 
	 * @return the tid
	 */
	@Column(name = "TID")
	public String getTid() {
		return tid;
	}
	/**
	 * @param tid the tid to set
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
