package com.CHB.StartFlow.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.CHB.StartFlow.vo.Player;

@Mapper
public interface PlayerDao {

	@Insert("""
			INSERT INTO player
				SET `name` = #{name}
			,weight = #{name}
			,height = #{height}
			,birth = #{birth}
			,country = #{name}
					""")
	public Player add(String name, String wetight, String height, String birth, String country);

	@Select("""
			SELECT *
				FROM player
				WHERE id = #{id}
			""")
	public Player getPlayerById(int id);

	@Delete("""
			DELETE
				FROM player
				WHERE id = #{id}
			""")

	public void deletePlayer(int id);

	@Update("""
			<script>
			UPDATE player
				SET updateDate = NOW()
					<if test="name != null and name != ''">
						, `name` = #{title}
					</if>
					<if test="weight != null and weight != ''">
						, weight = #{body}
					</if>
					<if test="height != null and height != ''">
						, height = #{title}
					</if>
					<if test="birth != null and birth != ''">
						, birth = #{title}
					</if>
					<if test="country != null and country != ''">
						, country = #{title}
					</if>

				WHERE id = #{id}
			</script>
			""")
	public void updatePlayer(int id, String name, String wetight, String height, String birth, String country);

	@Select("""
			SELECT *
				FROM player
				ORDER BY id DESC
			""")
	public List<Player> list();

	@Select("""
			SELECT LAST_INSERT_ID();
			""")
	public int getLastInsertId();

}
