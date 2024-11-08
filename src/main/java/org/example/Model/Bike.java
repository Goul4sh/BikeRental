package org.example.Model;


import org.bson.codecs.pojo.annotations.BsonCreator;
import org.bson.codecs.pojo.annotations.BsonDiscriminator;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.example.Model.clients.PersonalIdMgd;
import org.example.Repositories.UniqueIdMgd;

@BsonDiscriminator
public class Bike extends AbstractEntityMgd {
    @BsonProperty("personalid")
    private PersonalIdMgd personalId;
    @BsonProperty("model_name")
    private String modelName;
    @BsonProperty("is_available")
    private boolean isAvailable;
    @BsonCreator
    public Bike(@BsonProperty("_id") UniqueIdMgd entityId,
                @BsonProperty("personalid") PersonalIdMgd bikeId,
                @BsonProperty("model_name") String modelName,
                @BsonProperty("is_available") boolean isAvailable) {
        super(entityId);
        this.personalId = bikeId;
        this.modelName = modelName;
        this.isAvailable = isAvailable;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public PersonalIdMgd getBikeId() {
        return personalId;
    }

    public String getInfo() {
        return "Rower ID: " + personalId.toString()+ ", Model: " + modelName + " Dostępność: " + isAvailable;
    }
}