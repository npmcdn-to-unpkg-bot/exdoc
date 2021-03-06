package com.tao.exdoc.domain.borrow;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.tao.exdoc.domain.AbstractDomain;
import com.tao.exdoc.domain.enumurate.Status;
import com.tao.exdoc.domain.master.BorrowObjective;
import com.tao.exdoc.domain.master.Branch;
import com.tao.exdoc.domain.master.Department;
import com.tao.exdoc.domain.master.Position;
import com.tao.exdoc.domain.security.User;
@JsonInclude(Include.NON_NULL)
public class Borrow extends AbstractDomain<Integer>{
		
	public Borrow()
	{
		this.items = new HashSet<BorrowItem>();
	}
	private String borrowCode;
	private String borrowDesc;
	private Date borrowDate;
	private User borrowBy;
	private Date reviewDate;
	private User reviewBy;
	private Date approveDate;
	private User approveBy;
	private Status status;
	private String remark;
	private Set<BorrowItem> items;
	private BorrowObjective objective;
	private Date dueDate;
	private Branch branch;
	private Department department;
	private Position position;
	
	
	
	public Branch getBranch() {
		if(branch!=null)
		{
			if(branch.getId()==null || branch.getId()==0)
			{
				return null;
			}
		}
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public Department getDepartment() {
		if(department!=null)
		{
			if(department.getId()==null || department.getId()==0)
			{
				return null;
			}
		}
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Position getPosition() {
		if(position!=null)
		{
			if(position.getId()==null || position.getId()==0)
			{
				return null;
			}
		}
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public BorrowObjective getObjective() {
		if(objective!=null)
		{
			if(objective.getId()==null || objective.getId()==0)
			{
				return null;
			}
		}
		return objective;
	}
	public void setObjective(BorrowObjective objective) {
		this.objective = objective;
	}
	public String getBorrowCode() {
		return borrowCode;
	}
	public void setBorrowCode(String borrowCode) {
		this.borrowCode = borrowCode;
	}
	public String getBorrowDesc() {
		return borrowDesc;
	}
	public void setBorrowDesc(String borrowDesc) {
		this.borrowDesc = borrowDesc;
	}
	public Date getBorrowDate() {
		return borrowDate;
	}
	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}
	public User getBorrowBy() {
		if(borrowBy!=null)
		{
			if(borrowBy.getId()==null||borrowBy.getId()==0)
			{
				return null;
			}
		}
		return borrowBy;
	}
	public void setBorrowBy(User borrowBy) {
		this.borrowBy = borrowBy;
	}
	public Date getReviewDate() {
		
		return reviewDate;
	}
	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}
	public User getReviewBy() {
		if(reviewBy!=null)
		{
			if(reviewBy.getId()==null || reviewBy.getId()==0)
			{
				return null;
			}
		}
		return reviewBy;
	}
	public void setReviewBy(User reviewBy) {
		this.reviewBy = reviewBy;
	}
	public Date getApproveDate() {
		return approveDate;
	}
	public void setApproveDate(Date approveDate) {
		this.approveDate = approveDate;
	}
	public User getApproveBy() {
		if(approveBy!=null)
		{
			if(approveBy.getId()==null || approveBy.getId()==0)
			{
				return null;
			}
		}
		return approveBy;
	}
	public void setApproveBy(User approveBy) {
		this.approveBy = approveBy;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Set<BorrowItem> getItems() {
		return items;
	}
	public void setItems(Set<BorrowItem> items) {
		this.items = items;
	}

	
}
