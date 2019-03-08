
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testuserprofile;
/**
 * The user profile for the OnlineVids system. The user has a userID
 * and a favourite genre that must be one of the choices in the
 * genres array. This code is to be used for SYST 17796 midterm exam.
 * Students are reminded to add themselves as modifiers when editing the
 * code.
 * @author dancye, 2019
 */
public class UserProfile 
{
    
    private String userID;//the userID
    private String userName;//the userName
    private String genre;// the user's preferred genre of movie
    private String[] genres = {"Comedy", "Drama", "Action", "Mystery"};//available genres of movies
    
    /**
     * No arg-constructor
     */
    public UserProfile() {
    }
    
    
    /**
     * A constructor that takes in the userID and the favourite genre
     * @param userName the name to assign to this user
     * @param givenID the ID to assign to this user
     * @param givenGenre the users favourite genre
     */
    public UserProfile(String userName, String givenID, String givenGenre)
    {
        this.userName = userName;
        userID = givenID;
        genre= givenGenre;
    }

    /**
     * A getter for the userID
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }
    
    /**
     * A getter for the name
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * @param userName the genre to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * A getter for the genre
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    
    @Override
    public String toString() {
        return "User name: " + getUserName()
             + "\nUser ID: " + getUserID()
             + "\nFavorite genre: " + getGenre();
    }
    
    
}//end class
