package ua.ivanskyi.shop.dao.impl;

import org.springframework.stereotype.Repository;

import ua.ivanskyi.shop.dao.UserOperation;
import ua.ivanskyi.shop.entity.User;

@Repository
public class UserOperationImpl extends BaseOperationImpl<User, Long> implements UserOperation {

	public UserOperationImpl() {
		super(User.class);

	}

}
