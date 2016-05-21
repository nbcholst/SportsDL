package com.example.android.sportsdl;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cholni01 on 5/20/2016.
 */
public class TeamLab {

    private static TeamLab sTeamlab;
    private List<Team> mTeams;

    private TeamLab(Context context){
        mTeams = new ArrayList<>();
        for (int i = 0; i <20; i++){
            Team Team = new Team();
            Team.setTitle("Team #"+i);
            Team.setSelected(i % 2 ==0);
            mTeams.add(Team);
        }
    }

    public List<Team> getTeams(){
        return mTeams;
    }

    public static TeamLab get(Context context){
        if (sTeamlab == null){
            sTeamlab = new TeamLab(context);
        }
        return sTeamlab;
    }
}
