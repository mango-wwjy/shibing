package intern_server.shibing.dao;

import intern_server.shibing.data.po.AuthUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface AuthUserDao extends Mapper<AuthUser> {
    AuthUser getUserLogin(@Param("socialId") String socialId, @Param("password") String password);
}
