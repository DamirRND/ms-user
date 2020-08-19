package rs.sweetchoice.msuser.mappers;

import org.mapstruct.Mapper;
import rs.sweetchoice.msuser.dto.UserDto;
import rs.sweetchoice.msuser.entities.User;

@Mapper
public interface UserMapper {

    User userDtoToUser(UserDto userDto);
    UserDto userToUserDto(User user);
}
