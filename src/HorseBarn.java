public class HorseBarn {
    private Horse[] spaces;

    public HorseBarn(Horse[] spaces)
    {
        this.spaces=spaces;
    }

    public int findHorseSpace(String name) {
        for (int i = 0; i < this.spaces.length; i++) {
            if (this.spaces[i] != null && name.equals (this.spaces[i].getName())){
                return i ;
            }
        }
        return -1;
    }

    public void consolidate() {
        for (int i = 0; i < this.spaces.length-1; i++) {
            if (this.spaces[i] == null) {
                for (int j = i+1; j < this.spaces.length; j++) {
                    if (this.spaces[j] != null) {
                        this.spaces[i] = this.spaces[j];
                        this.spaces[j] = null;
                        j = this.spaces.length;
                    }
                }
            }
        }
    }

    @Override
    public String toString()
    {
        String barn="";
        int i=0;
        for (Horse horse: this.spaces)
        {
            if(horse==null)
            {
                barn = barn + "Index "+ i+ " of the barn:"+" null"+ "\n";
            } else {
                barn = barn+ "Index "+ i+ " of the barn:  "+"Name: "+horse.getName() +"  Weight: "+ horse.getWeight()+ "\n";
            }
            i++;
        }
        return barn;
    }
}

