package com.mokelab.demo.multimodule.screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.mokelab.demo.multimodule.repository.Data831RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data832RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data833RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data834RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data835RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data836RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data837RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data838RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data839RepositoryImpl 
import com.mokelab.demo.multimodule.repository.Data840RepositoryImpl 

import javax.inject.Inject

@HiltViewModel
class Screen084ViewModel @Inject constructor(
    private val repo1: Data831RepositoryImpl,
    private val repo2: Data832RepositoryImpl,
    private val repo3: Data833RepositoryImpl,
    private val repo4: Data834RepositoryImpl,
    private val repo5: Data835RepositoryImpl,
    private val repo6: Data836RepositoryImpl,
    private val repo7: Data837RepositoryImpl,
    private val repo8: Data838RepositoryImpl,
    private val repo9: Data839RepositoryImpl,
    private val repo10: Data840RepositoryImpl,

): ViewModel() {
}
