package com.scaler.splitwise.controllers;

import com.scaler.splitwise.dtos.SettleUpGroupRequestDto;
import com.scaler.splitwise.dtos.SettleUpGroupResponseDto;
import com.scaler.splitwise.dtos.SettleUpUserRequestDto;
import com.scaler.splitwise.dtos.SettleUpUserResponseDto;
import org.springframework.stereotype.Controller;

@Controller
public class SettleUpController {

    /*
    Returns the list of transactions, if they are executerd will make balance
    of the user making request as 0 with each of their friends.
     */
    public SettleUpUserResponseDto settleUpUser(
            SettleUpUserRequestDto request
    ) {


        return null;
    }

    public SettleUpGroupResponseDto settleUpGroup(SettleUpGroupRequestDto request) {
        return null;
    }
}
