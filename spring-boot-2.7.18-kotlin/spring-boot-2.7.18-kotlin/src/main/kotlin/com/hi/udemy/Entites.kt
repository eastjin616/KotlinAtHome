package com.hi.udemy

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "users")
class User(
    var userId:String,
    var password:String,
    @Id @GeneratedValue var id:Long?=null
)

//CREATE TABLE Usr (
//    userId TEXT NOT NULL,
//    password BARCHAR(20) NOT NULL,
//    id LONG NOT NULL PRIMARY KEY,
//)